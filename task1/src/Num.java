import java.util.Scanner;
public class Num {
    public static void num(String[] args)
    {
        Scanner x=new Scanner (System.in);
        System.out.println("enter the number between 1 to 10");
        int num =x.nextInt();
        if (num>=1&&num<=10)
        {
            System.out.println("the number is valied "+" "+num);
        }
        else
        {
            System.out.println("the number is invalied");
        }

    }
}
