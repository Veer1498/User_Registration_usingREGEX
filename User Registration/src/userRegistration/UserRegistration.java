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
    public void lastName() {
        System.out.println("Please Enter Valid Last Name");
        String lastName = sc.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{3,}", lastName));
    }
    public void email() {
        System.out.println("Please Enter Valid Email");
        String email = sc.next(); //given : abc.xyz@bl.co.in
        System.out.println(Pattern.matches("[a-z]*.[a-z]*@[b]+[l]+.[c]+[o]+.[i]+[n]+", email));
    }

}
