import java.util.Scanner;
public class Largest_Smallest{
    public static void main(String ar[])
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        int i=0;
        for(i =0;i<10;i++)
        {
            int num = sc.nextInt();
            if(max < num)
             max = num; 
            if(min > num)
            {
                min = num;
            }
        }

        System.out.printf("max = %d , min =%d ",max,min);
    }
}