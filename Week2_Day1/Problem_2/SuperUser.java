package mission.Week2_Day1.Problem_2;

public class SuperUser extends User implements ReviewerRole, AdminRole{
    public SuperUser(String username) {
        super(username);
    }

    @Override
    public void manageUsers() {
        System.out.println("슈퍼유저(" + username + ")은 유저를 매니징할 수 있습니다");
    }

    @Override
    public void changeSettings() {
        System.out.println("슈퍼유저(" + username + ")은 유저를 세팅을 변경할 수 있습니다");

    }
}
