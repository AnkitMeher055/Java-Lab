import java.util.Scanner;
public class PrimeFactors{
    public static void main(String ar[])
    { 
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n == 1 || n == 2)
        {
            System.out.println("1 , 2");
        } 
        for(int i = 2;i<=n/2;i++)
        {
            if(n % i ==0)
            {
                for(int j =2 ;j<i;j++)
                {
                    if(i % j ==0)
                    {
                        
                    }
                    else{
                        System.out.println(i+" ");
                    }
                }
            }
        }

    }

}