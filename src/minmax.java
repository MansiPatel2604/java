import java.util.Scanner;
import java.math.*;
public class minmax
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int num1,num2,num3,min1,min2,max1,max2;
        System.out.println("Enter three numbers");
        num1=in.nextInt();
        num2=in.nextInt();
        num3=in.nextInt();
        min1=Math.min(num1,num2);
        min2=Math.min(min1,num3);
        max1=Math.max(num1,num2);
        max2=Math.max(max1,num3);
        System.out.println("Maximum number="+max2);
        System.out.println("Minimum number="+min2);

    }
}
