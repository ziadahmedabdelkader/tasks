import java.util.Scanner;
public class Printfactorial {
    public static void sum(String[] args)
    {
        System.out.println("enter the number");
        Scanner x=new Scanner(System.in);
        int number =x.nextInt();
        int sum;
        for(int i=1 ;i<number;i++)
        {
            System.out.println(i+"*");
             sum = i*(i+1);
        }
        System.out.println(sum);
    }
}
