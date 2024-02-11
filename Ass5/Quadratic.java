import java.util.Scanner;
class Quadratic {
public static void main(String ar[]){
Scanner sc = new Scanner(System.in);

System.out.print("enter the value  of a :");
int a = sc.nextInt();

System.out.print("enter the value  of b :");
int b = sc.nextInt();

System.out.print("enter the value  of c :");
int c = sc.nextInt();

int D = 0;

D = (b*b)-(4*a*c);

if(D<0){
System.out.print("Roots are imaginary");
}else if(D==0){
System.out.println("Roots are equal so only root is possible");
}
else{
System.out.println("Roots are rational and squared or");
System.out.println("Roots are ratinal but not squared");
}
}
}

