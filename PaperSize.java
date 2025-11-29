import java.util.Scanner;

public class PaperSize {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter paper size (A0 - A5): ");
        String size = sc.next().toUpperCase();

        int mmWidth = 0, mmHeight = 0;
        double inchWidth = 0, inchHeight = 0;

        switch (size) {

            case "A0":
                mmWidth = 841; mmHeight = 1189;
                inchWidth = 33.1; inchHeight = 46.8;
                break;

            case "A1":
                mmWidth = 594; mmHeight = 841;
                inchWidth = 23.4; inchHeight = 33.1;
                break;

            case "A2":
                mmWidth = 420; mmHeight = 594;
                inchWidth = 16.5; inchHeight = 23.4;
                break;

            case "A3":
                mmWidth = 297; mmHeight = 420;
                inchWidth = 11.7; inchHeight = 16.5;
                break;

            case "A4":
                mmWidth = 210; mmHeight = 297;
                inchWidth = 8.3; inchHeight = 11.7;
                break;

            case "A5":
                mmWidth = 148; mmHeight = 210;
                inchWidth = 5.8; inchHeight = 8.3;
                break;

            default:
                System.out.println("Invalid paper size! Enter A0 to A5.");
                sc.close();
                return;
        }

        System.out.println("\nPaper Size " + size + ":");

        System.out.println("Dimensions in mm: " + mmWidth + " x " + mmHeight + " mm");
        System.out.println("Dimensions in inches: " + inchWidth + " x " + inchHeight + " inches");

    }
}
