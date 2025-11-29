import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GPA: ");
        float gpa = sc.nextFloat();

        System.out.print("Enter attendance percentage: ");
        float attendance = sc.nextFloat();

        System.out.print("Enter attitude score (1-10): ");
        int attitude = sc.nextInt();

        if (gpa >= 3.2) {
            if (attendance > 80) {
                if (attitude < 5) {
                    System.out.println("The student is ELIGIBLE for the scholarship.");
                } else {
                    System.out.println("Not eligible: Attitude score is too high.");
                }
            } else {
                System.out.println("Not eligible: Attendance below required level.");
            }
        } else {
            System.out.println("Not eligible: GPA is too low.");
        }
    }
}
