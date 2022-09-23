package Services.LoginService;

import Entity.User.User;

public class LoginService {
    private User user;

    public LoginService(User user) {
        this.user = user;
    }

    public boolean Login(String username, String password){
        //login logic
        if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
            System.out.println("Login successful.");
            return true;
        }
        else {
            System.out.println("Please check user name and password.");
            return false;
        }
    }

    public void Logout(String username){
        //logout logic
        System.out.println("Logged out from the system.");
    }
}
