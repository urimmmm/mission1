package mission.Week2_Day3.Problem_2;

public abstract class ElderGroupCollegeStudent extends CollegeStudent {
    public ElderGroupCollegeStudent(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "ElderGroupCollegeStudent{" +
                "studentNumber='" + studentNumber + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
