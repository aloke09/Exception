package Exception;

import java.util.Scanner;

public class BasicExample//unchecked
{
    public static void main(String[] args) {
        System.out.println("Enter length of array(0-9)-");
        Scanner sc=new Scanner(System.in);
        try(sc)
        {
            int l=sc.nextInt();
            int []arr=new int[l];
            for(int i=0;i<=l;i++)
            {
                System.out.println(arr[i]=i);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("finally block excuted sucessgully");
        }
    }
}
