import java.util.Scanner;
public class SumOfDigits{
    public static void main(String ar[])
    {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int sum =0;
      while(num !=0)
      {
        int rem = num%10;
        sum+=rem;
        num = num/10;
      }
     System.out.println("sum is"+sum);
    }
}