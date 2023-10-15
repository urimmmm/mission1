package mission.Week2_Day5.Problem_1;

import java.util.ArrayList;
import java.util.List;

public class ScoreTest {
    public static void main(String[] args){
        // List 제공
        List<Student> students = new ArrayList<>();

        students.add(new Student("아이유", "여자", 95));
        students.add(new Student("박보검", "남자", 92));
        students.add(new Student("송중기", "남자", 90));
        students.add(new Student("김태리", "여자", 85));
        students.add(new Student("전정국", "남자", 88));
        students.add(new Student("방탄소년단", "남자", 70));
        students.add(new Student("이지은", "여자", 63));
        students.add(new Student("윤아", "여자", 70));
        students.add(new Student("하정우", "남자", 75));
        students.add(new Student("공유", "남자", 80));

        //TODO: 남학생들 중 가장 낮은 성적을 가진 학생의 이름 출력하기
        String lowestScoreMaleStudentName = students.stream()
                .filter( (student) -> student.getGender().equals("남자"))
                        .min( (s1, s2) -> s1.getScore() - s2.getScore() )
                                .map( (studnet) -> studnet.getName())
                                        .orElse("N/A");
        System.out.printf("가장 성적이 낮은 남학생 이름: %s\n", lowestScoreMaleStudentName);

        //TODO: 여학생들 중 성적 상위 3명의 평균 성적 구하기
        double femaleStudentsCount = students.stream()
                        .filter( (student -> student.getGender().equals("여자"))).count();

        double averageScoreOfTop3FemaleStudents = femaleStudentsCount < 3 ? 0: students.stream()
                .filter(student -> student.getGender().equals("여자"))
                .sorted((s1, s2) -> s2.getScore() - s1.getScore() )
                .limit(3)
                .mapToInt(student -> student.getScore())
                .average()
                .orElse(0);

        System.out.printf("여학생 상위 3명 평균: %.2f\n", averageScoreOfTop3FemaleStudents);
    }

}
