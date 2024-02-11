import java.util.Scanner;
public class Add {
public static void main(String ar[]){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int sum = 0;
while(sum>9 || num>0){
if(num == 0)
{
num = sum;
sum =0;
}
int rem = num%10;
sum += rem;
num = num/10;
}
System.out.println("sum ="+sum);
}
}
