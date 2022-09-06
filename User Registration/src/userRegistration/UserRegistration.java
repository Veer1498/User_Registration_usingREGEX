package userRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Given : User Registration System needs to ensure all validations are in place during the User Entry.
 * Author : Veer
 */

public class UserRegistration {
    Scanner sc = new Scanner(System.in);
    public void welcome(){
        System.out.println("Welcome to User Registration Program");
        System.out.println("====================================");
    }
    public void firstName(){
        System.out.println("Please Enter Valid First Name");
        String firstName = sc.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{3,}",firstName));

    }
}
