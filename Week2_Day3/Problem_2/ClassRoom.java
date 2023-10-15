package mission.Week2_Day3.Problem_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ClassRoom<T extends CollegeStudent> {
    private String className;
    private Map<String, T> studentMap; //학생 객체를 관리하기 위함
    private List<String> studentNames; //학생 이름 저장

    public ClassRoom(String className) { //생성자로 정의를 함
        this.className = className;
        studentMap = new HashMap<>();
        studentNames = new ArrayList<>();
    }
    //제네릭으로 선언 - main에서 클래스로 값을 넣어줬기 때문에 student는 클래스를 의미
    public void addStudent(T student) {
        //학생 번호로 찾기 위해서 studentMap에 학생 번호와 클래스 저장
        studentMap.put(student.getStudentNumber(), student);
        //학생 이름은 리스트에 저장
        studentNames.add(student.getName());
    }
    //학생 번호를 받아와 studentMap에서 꺼냄
    public T getStudentByStudentNumber(String studentNumber) {
        return studentMap.get(studentNumber);
    }
    //학생 이름을 출력함 연결해서 출력하기 위해서 StringBuilder 사용
    public void printStudentNames() {
        StringBuilder sb = new StringBuilder();
        //이름을 studentName 리스트 끝까지 출력
        for (String name : studentNames) {
            sb.append(",")
                    .append(name);
        }
        System.out.println("이 클래스 룸(" + this.className + ")은 학생들 [" + sb.deleteCharAt(0) + "]가 있습니다.");
    }
}