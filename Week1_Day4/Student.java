package mission.Week1_Day4;

public class Student {
    private String studentName;
    private int studentNumber;
    private String major;
    private int classYear;


    //생성자
    public Student(String studentName, int studentNumber, String major, int classYear){
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this. major = major;
        this.classYear = classYear;
    }
    //getter
    public String getStudentName(){
        return studentName;
    }
    public int getStudentNumber(){
        return studentNumber;
    }
    public String getMajor(){
        return major;
    }
    public int getClassYear(){
        return classYear;
    }

}
