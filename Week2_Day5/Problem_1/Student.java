package mission.Week2_Day5.Problem_1;

public class Student {
    // 속성 (2) 학생 개인정보
    private String name; // 이름
    private String gender; // 성별

    private int score;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getScore() {
        return score;

    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, String gender, int score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }
}
