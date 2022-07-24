import java.util.Scanner;
public class Num {
    public static void num(String[] args)
    {
        Scanner x=new Scanner (System.in);
        System.out.println("enter number between 1 to 10");
        int number=x.nextInt();
        if (number>=1&&number<=10)
        {
            System.out.println("the number is valied");
        }
        else {
            System.out.println("the number is invalied");
        }
    }
}
