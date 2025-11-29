import java.util.Scanner;

public class Scenariobased {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter your age group (Child / Adult / Senior): ");
        String ageGroup = sc.nextLine();

        System.out.println("Enter movie language (Nepali / Hindi / English): ");
        String language = sc.nextLine();

        System.out.println("Are you a student? (yes / no): ");
        String student = sc.nextLine();

        System.out.println("Is it a festival day? (yes / no): ");
        String festival = sc.nextLine();
      
        double basePrice = 0;
      
        if (ageGroup.equalsIgnoreCase("Child")) {
            basePrice = 150;
        } 
        else if (ageGroup.equalsIgnoreCase("Adult")) {
            basePrice = 250;
        } 
        else if (ageGroup.equalsIgnoreCase("Senior")) {
            basePrice = 200;
        } 
        else {
            System.out.println("Invalid age group!");
            return;
        }

        // Language-based price addition
        if (language.equalsIgnoreCase("Hindi")) {
            basePrice += 50;
        } 
        else if (language.equalsIgnoreCase("English")) {
            basePrice += 100;
        } 
        else if (!language.equalsIgnoreCase("Nepali")) {
            System.out.println("Invalid movie language!");
            return;
        }
        
        double finalPrice = basePrice;

        // Student discount
        if (student.equalsIgnoreCase("yes")) {
            finalPrice *= 0.80; // 20% discount
        }

        // Festival discount
        if (festival.equalsIgnoreCase("yes")) {
            finalPrice *= 0.85; // 15% discount
        }
        
        // Display Output
        System.out.printf("Final Ticket Price is: Rs. %.2f", finalPrice);
        sc.close();
    }
}