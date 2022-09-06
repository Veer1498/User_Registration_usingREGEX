package userRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Given : User Registration System needs to ensure all validations are in place during the User Entry.
 * Author : Veer
 */

//User Registration Class
public class UserRegistration {
    Scanner sc = new Scanner(System.in);

    //Welcome Function
    public void welcome(){
        System.out.println("Welcome to User Registration Program");
        System.out.println("====================================");
    }
    //firstName Function
    public void firstName(){
        System.out.println("Please Enter Valid First Name");
        String firstName = sc.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{3,}",firstName));

    }
    //LastName Function
    public void lastName() {
        System.out.println("Please Enter Valid Last Name");
        String lastName = sc.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{3,}", lastName));
    }
    //Email Function
    public void email() {
        System.out.println("Please Enter Valid Email");
        String email = sc.next(); //given : abc.xyz@bl.co.in
        System.out.println(Pattern.matches("[a-z]*.[a-z]*@[b]+[l]+.[c]+[o]+.[i]+[n]+", email));
    }
    //Mobile Number Function
    public void mobileNumber() {
        System.out.println("Please Enter Valid Mobile Number");
        String number = sc.next(); //given : 91 9919819801
        System.out.println(Pattern.matches("[0-9]{2}[\s]+[0-9]{10}", number));
    }
    //password Function
    public void password() {
        System.out.println("Please Enter Valid Password");
        String password = sc.next();
        System.out.println(Pattern.matches("[A-Z]+[A-z0-9]{6,}[@]+[0-9]+", password));
    }
}
