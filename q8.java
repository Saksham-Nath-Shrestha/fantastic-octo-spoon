import java.util.Scanner;

public class q8
{
    public static void main(String[]args)
    {
     Scanner scan= new Scanner(System.in);
     System.out.println("enter any number");
     int firstnum= scan.nextInt();
     System.out.println("the multiplication table of "+firstnum+"is:");
     
     for (int i= 1; i<=10; i++)
     {
         System.out.println(+i+"x" +firstnum+ "=" +i*+firstnum);
     }
    }
    }