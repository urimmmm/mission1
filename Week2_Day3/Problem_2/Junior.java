package mission.Week2_Day3.Problem_2;

public class Junior extends ElderGroupCollegeStudent{
    public Junior(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "Junior{" +
                "studentNumber='" + studentNumber + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
