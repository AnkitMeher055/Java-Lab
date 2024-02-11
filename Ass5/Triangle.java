import java.util.Scanner;
class Triangle {
public static void main(String ar[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter values of three sides");
int s1 = sc.nextInt();
int s2 = sc.nextInt();
int s3 = sc.nextInt();

if(s1==s2 && s2==s3){
System.out.println("Given triangle is equilateral");
}
else if(s1==s2 || s2==s3 || s3==s1)
{
System.out.println("given triangle is isoceles");
}
else{
System.out.println("given triangle is scalene");
}
}
}
