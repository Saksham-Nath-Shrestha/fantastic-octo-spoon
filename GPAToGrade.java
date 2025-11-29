import java.util.Scanner;

public class GPAToGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GPA (0.0 - 4.0): ");
        float gpa = sc.nextFloat();

        if (gpa < 0.0 || gpa > 4.0) {
            System.out.println("Invalid GPA! Please enter between 0.0 and 4.0.");
        } else if (gpa >= 3.6) {
            System.out.println("Grade: A");
        } else if (gpa >= 3.0) {
            System.out.println("Grade: B");
        } else if (gpa >= 2.0) {
            System.out.println("Grade: C");
        } else if (gpa >= 1.0) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

    }
}
