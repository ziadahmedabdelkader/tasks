//zead ahmed
//task 1
import java.util.Scanner;
public class Str {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        String x = new String("end");
        while (true) {
            System.out.println("the name is ");
            x=temp.nextLine();
            if(x.equals("end") )
                break;
            else if(x==null)
            {
                System.out.println("thir is no one ");

            }
        }

    }
}


