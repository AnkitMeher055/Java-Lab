import java.util.Scanner;
public class Palindrome{
    public static void main(String ar[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int num = sc.nextInt();
    int temp = num;
    int rev =0;
    while(num!=0)
    {
        int rem = num%10;
        rev = rev*10+(rem);
        num = num/10;
    }

    if(rev == temp)
    {
        System.out.println("Palindrome number");
    }else{
        System.out.println("not a palindrome number");
    }


    
}

}
