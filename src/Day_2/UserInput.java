package Day_2;
import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Object of Scanner

        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Your age is "+age);
    }
}
