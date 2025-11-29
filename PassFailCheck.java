import java.util.Scanner;

public class PassFailCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the student's marks: ");
        int marks = sc.nextInt();
        
        if (marks >= 40) {
            System.out.println("The student has PASSED.");
        } 
        else {
            System.out.println("The student has FAILED.");
        }
    }
}