import java.util.*;

public class Num
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n > 0)
        {
            System.out.println("Even Number " + n);
        }
        else
        {
            System.out.println("Odd Number " + n);
        }
    }
}