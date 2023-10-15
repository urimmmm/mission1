package mission.Week2_Day5.Problem_2;

//TODO: User 클래스 정의
class User {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
