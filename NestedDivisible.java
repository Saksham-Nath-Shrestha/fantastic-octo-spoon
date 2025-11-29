import java.util.Scanner;

public class NestedDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0) {
            if (num % 5 == 0) {
                System.out.println(num + " is divisible by BOTH 3 and 5.");
            } else {
                System.out.println(num + " is divisible by 3 but NOT by 5.");
            }
        } else {
            System.out.println(num + " is NOT divisible by 3, so it cannot be divisible by both.");
        }
    }
}
