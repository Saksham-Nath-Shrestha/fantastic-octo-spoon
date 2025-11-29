import java.util.Scanner;

public class SellingPriceSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marked price: ");
        float mp = sc.nextFloat();

        System.out.print("Enter category (A/B/C/D): ");
        char category = sc.next().charAt(0);

        float discount;

        switch (Character.toUpperCase(category)) {
            case 'A':
                discount = 0.60f;
                break;
            case 'B':
                discount = 0.40f;
                break;
            case 'C':
                discount = 0.20f;
                break;
            case 'D':
                discount = 0.10f;
                break;
            default:
                System.out.println("Invalid category!");
                sc.close();
                return;
        }

        float sp = mp - (mp * discount);

        System.out.println("Selling Price = " + sp);
    }
}
