package mission.Week2_Day3.Problem_2;

public class Freshman extends YoungGroupCollegeStudent{
    public Freshman(String studentID, String name, double score) {
        super(studentID, name, score);
    }

    @Override
    public String toString() {
        return "Freshman{" +
                "studentNumber='" + studentNumber + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
