package userRegistration;
/**
 * Given : User Registration System needs to ensure all validations are in place during the User Entry.
 * Author : Veer
 */
public class UserMain {
    public static void main(String[] args) {
        UserRegistration userData = new UserRegistration();

        userData.welcome();
        userData.firstName();
        userData.lastName();
    }
}
