package Exception;

import java.util.Scanner;

public class CheckedException
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try(sc)
        {
            System.out.print("Enter value1=");
            int v1= sc.nextInt();
            System.out.print("\nEnter value2=");
            int v2= sc.nextInt();
            System.out.println("Result="+v1/v2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
