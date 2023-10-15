package mission.Week2_Day3.Problem_2;

public class Sophomore extends YoungGroupCollegeStudent{
    public Sophomore(String studentID, String name, double score) {
        super(studentID, name, score);
    }

    @Override
    public String toString() {
        return "Sophomore{" +
                "studentNumber='" + studentNumber + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
