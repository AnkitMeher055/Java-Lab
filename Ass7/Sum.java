import java.util.Scanner;
public class Sum {
public static void main(String ar[]){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int sum = 0;
while(num >= 9){
int rem = num%10;
sum += rem;
num = num/10;
}
System.out.println("sum ="+sum);
}
}
