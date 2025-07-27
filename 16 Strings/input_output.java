import java.util.*;

public class input_output {

    public static void printLetters(String str) {
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Strings are IMMUTABLE in java

        // How to create and use length function of String.
    
        // String str = "abcd";
        // String str2 = new String("xyz");
        // System.out.println("length of str 1 and str 2 is " + str.length() + " " + str2.length() + " respectively.");

        // How to take input as a String

        // System.out.print("Enter your name : ");
        // String name = sc.nextLine();
        // System.out.println(name);

        // Concatenation in String
        String firstName = "Ruturaj";
        String lastname = "Nikam" ;
        String fullName = firstName + " " + lastname;
        System.out.println(fullName);

        // CharAt function
        printLetters(firstName);

        sc.close();
    }
}
