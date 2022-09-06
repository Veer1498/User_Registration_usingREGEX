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

        while(true){
            System.out.println("Please Enter Option 1.FirstName 2.LastName 3.Email 4.Mobile Number 5.Password 0.Exit");
            int option = userData.sc.nextInt();

            switch(option){
                case 1 :
                    userData.firstName();
                    break;
                case 2 :
                    userData.lastName();
                    break;
                case 3:
                    userData.email();
                    break;
                case 4:
                    userData.mobileNumber();
                    break;
                case 5:
                    userData.password();
                    break;
                case 0 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Invalid Option");
            }
        }


    }
}
