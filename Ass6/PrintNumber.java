import java.util.Scanner;
public class PrintNumber{
    public static void main(String ar[])
    {
      int count =0;
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int temp = num;
      int sum =0;
      while(num !=0)
      {
        int rem = num%10;
        sum+=rem;
        num = num/10;
        num++;
      }

      while(sum!=0)
      {
        int rem = temp%10;
        int rem2 = temp%10;
        if(rem == rem2)
        {
            System.out.println(rem);
            count++;
        }
      }
    }
 
}