package userRegistration;
/**
 * Given : User Registration System needs to ensure all validations are in place during the User Entry.
 * Author : Veer
 */
/*
STEPS :
1. Created User Main class with main Function
2. Created the Object of User Registration as userdata
3. Calling All the Methods in That Class
 */
public class UserMain {
    public static void main(String[] args) {
        UserRegistration userData = new UserRegistration();

        userData.welcome();
        userData.firstName();
        userData.lastName();
        userData.email();
        userData.mobileNumber();
        userData.password();
    }
}
