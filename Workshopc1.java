
/**
 * Write a description of class Workshopc1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshopc1
{
int age;//instance variable 
static int qty;//static variable
public static void main(String[] args)

{   int age=18;    //<classname><variable>=new <classname>();    
    Workshopc1 v1=new Workshopc1();
    System.out.println(v1.age);
    
    System.out.println(age);
    System.out.println(Workshopc1.qty);
}
}