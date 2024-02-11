import java.util.Scanner;
public class Multiply {
public static void main(String ar[]){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int mul = 1;
while(mul>9 || num>0){
if(num == 0)
{
num = mul;
mul =1;
}
int rem = num%10;
if(rem != 0){
mul *= rem;
num = num/10;
}else{
num = num/10;
}
}
System.out.println("multiplication is ="+mul);
}
}