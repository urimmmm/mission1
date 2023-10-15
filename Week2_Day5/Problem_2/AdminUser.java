package mission.Week2_Day5.Problem_2;

//TODO: AdminUser 클래스 정의
class AdminUser extends User {
    public AdminUser(String userName) {
        super(userName);
    }
    @Override
    public String toString() {
        return "AdminUser: " + getUserName();
    }

}
