import java.util.Scanner;
public class age
{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int ag;
        System.out.println("Enter age=");
        ag=in.nextInt();
        if(ag>18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible");

    }
}
