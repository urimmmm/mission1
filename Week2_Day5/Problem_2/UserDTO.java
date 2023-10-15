package mission.Week2_Day5.Problem_2;

import java.io.Serializable;

// TODO: UserDTO 클래스 정의
class UserDTO implements Serializable {
    private String userName;
    private String role;

    public UserDTO(String userName, String role) {
        this.userName = userName;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public String getRole() {
        return role;
    }
}