package mission.Week1_Day4;

public class StudentManagementSystem {
    private Student[] studentArray; //학생 클래스를 배열 값으로 관리하기 위해서 선언
    private int size;

    //함수 학생관리시스템 함수를 선언
    //총 학생관리를 몇 명을 할 것인지 capacity로 정해줌
    //생성자
    public StudentManagementSystem(int capacity) {
        //Student 클래스를 studentArray에 지칭해줌
        this.studentArray = new Student[capacity];
        //size는 0으로 변경
        this.size = 0;
    }

    //학생 추가
    public void addStudent(Student student) {
        //학생배열 길이가 size보다 작으면 실행
        if (size < studentArray.length) {
            //배열 안에 학생 값을 넣기 위해서
            //메인에서 Student 클래스를 객체로 만들면서 객체의 변수에서 생성자로 변수를 초기화했기 때문에 이름, 학번, 전공, 학년이 한번에 들어감)
            studentArray[size] = student;
            //학생을 추가했기 때문에 size 1증가
            size++;
            //학생 추가 코멘트를 학생이름으로 보여주기 윙해서 getStudentName을 사용
            System.out.println("학생추가: " + student.getStudentName());
        }
        //학생배열 길이가 size보다 크면 실행
        else {
            //주어진 데이터 양보다 많기 때문에 실행할 수 없다는 코멘트
            System.out.println("학생 데이터베이스에 자리가 없습니다");
        }
    }

    //학생 삭제
    public void removeStudent(Student student) {
        //0부터 size 보다 작을 때까지 1증가하면서 실행
        for (int i = 0; i < size; i++) {
            //studentArray값이 student 변수와 같으면 실행
            if (studentArray[i] == student) {
                //삭제하기 위해서 값을 왼쪽으로 옮겨주기 위해서 실행
                for (int j = i; j < size - 1; j++) {
                    //j+1 뒤에 있던 값을 j 앞쪽으로 옮겨줌
                    studentArray[j] = studentArray[j + 1];
                }
                //학생값이 줄었으므로 배열의 값도 줄이고 초기화
                studentArray[size - 1] = null;
                //학생삭제로 인해 size 감소
                size--;
                //학생삭제됐다는 코멘트를 이름으로 보여줌
                System.out.println("학생삭제: " + student.getStudentName());
                //for 문을 벗어나기 위해서 종료
                return;
            }
        }
        //for 문을 다 돌았는데도 출력값이 없다면 삭제할 값이 없다는 것을 의미하는 코멘트
        System.out.println("학생을 찾을 수 없습니다");
    }

    //학생 검색
    public void searchStudent(int studentId) {
        //학생값을 찾기 위해서 size만큼 반복
        for (int i = 0; i < size; i++) {
            //검색할 떄 학생학번으로 찾기 위해서 배열 안에 있는 학생학번과 main에서 보내준 학생학번이 맞는 경우 실행
            if (studentArray[i].getStudentNumber() == studentId) {
                System.out.println("학생을 찾았습니다");
                //학생 값을 배열 안에서 Student클래스 안에서 가져옴
                System.out.println("이름: " + studentArray[i].getStudentName());
                System.out.println("학번: " + studentArray[i].getStudentNumber());
                System.out.println("전공: " + studentArray[i].getMajor());
                System.out.println("학년: " + studentArray[i].getClassYear());
                //학생을 찾았으면 for 문을 벗어나기 위해 종료
                return;
            }
        }
        //for 문을 찾았어도 없다는 코멘트
        System.out.print("학생을 찾을 수 없습니다");
    }
}

