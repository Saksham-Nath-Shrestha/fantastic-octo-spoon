import java.util.Scanner;

public class FixedDepositNIB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean repeat = true;

        final double FEE_RATE = 0.005;
        final int MAX_YEARS = 5;
        final double MIN_DEPOSIT = 1000;

        while (repeat) {

            
            System.out.print("Enter Deposit Amount (Minimum Rs. 1000): ");
            double P = sc.nextDouble();

            if (P < MIN_DEPOSIT) {
                System.out.println("❌ Minimum deposit must be Rs. 1000.");
                continue;
            }


            System.out.print("Enter Annual Interest Rate (8 - 12): ");
            double annualRate = sc.nextDouble();

            if (annualRate < 8 || annualRate > 12) {
                System.out.println(" Interest rate must be between 8% and 12%.");
                continue;
            }


            System.out.print("Enter Duration in Years (Max 5 years): ");
            int years = sc.nextInt();

            if (years > MAX_YEARS || years <= 0) {
                System.out.println(" Duration must be between 1 and 5 years.");
                continue;
            }

          
            double monthlyRate = (annualRate / 100) / 12;

            // Total Months
            int months = years * 12;

            // A → Maturity Amount (Compound Monthly)
            double A = P * Math.pow(1 + monthlyRate, months);

            // Fee Calculation
            double fee = A * FEE_RATE;

            // Final Amount
            double finalAmount = A - fee;

            // ✅ Display All Required Values
            System.out.println("\n------ Fixed Deposit Summary ------");
            System.out.println("Principal (P): Rs. " + P);
            System.out.println("Annual Rate: " + annualRate + "%");
            System.out.println("Monthly Rate: " + monthlyRate);
            System.out.println("Years: " + years);
            System.out.println("Months: " + months);
            System.out.println("Maturity Amount (A): Rs. " + String.format("%.2f", A));
            System.out.println("Processing Fee (0.5%): Rs. " + String.format("%.2f", fee));
            System.out.println("Final Amount to Receive: Rs. " + String.format("%.2f", finalAmount));
            System.out.println("-----------------------------------");

            // Repeat Option
            System.out.print("\nDo you want to calculate another FD? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("no")) {
                repeat = false;
            }
        }

        System.out.println("\n Program Ended. Thank you!");
    }
}