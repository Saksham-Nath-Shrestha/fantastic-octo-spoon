    import java.util.Scanner;
    
    public class SellingPrice {
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter marked price: ");
            float mp = sc.nextFloat();
    
            System.out.print("Enter category (A/B/C/D): ");
            char category = sc.next().charAt(0);
    
            float discount = 0;
    
            if (category == 'A' || category == 'a') {
                discount = 0.60f;
            } else if (category == 'B' || category == 'b') {
                discount = 0.40f;
            } else if (category == 'C' || category == 'c') {
                discount = 0.20f;
            } else if (category == 'D' || category == 'd') {
                discount = 0.10f;
            } else {
                System.out.println("Invalid category!");
                sc.close();
                return;
            }
    
            float sp = mp - (mp * discount);
    
            System.out.println("Selling Price = " + sp);
    
            sc.close();
        }
    }
