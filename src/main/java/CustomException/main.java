package CustomException;

import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        System.out.println("enter a 2 digit no-");
        Scanner sc=new Scanner(System.in);
        try(sc)//try with resource
        {
            int no=sc.nextInt();
            if(no>9&&no<100)
            {
                System.out.println(no);
            }
            else {
                throw new cExcept("This is an example of custom Exception" +
                        "\n number entered is not a 2 digit number");
            }
        }
        catch (cExcept e)
        {
            e.printStackTrace();
        }
    }
}
