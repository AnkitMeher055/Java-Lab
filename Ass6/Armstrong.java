import java.util.*;
public class Armstrong {
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int result = 0;
        while(num!=0)
        {
            int rem = num % 10;
            int d = rem*rem*rem;
            result = result + d;
            num = num/10;
             
        }
         System.out.println(result);
        if(temp == result)
        System.out.println("armstrong number");
        else 
        System.out.println("not a armstrong number");
     

    }
}