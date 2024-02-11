class Set{
public static void main(String args[]){
String name = "Ankit Meher";
System.out.println("Your name :"+name);
int currentAge = 25;
int previousAge=0;
int nextAge=0;

name = "Amrit Meher";


int diff = currentAge%10;
previousAge = currentAge - diff;

int diff2 = currentAge/10;
nextAge = currentAge + diff2;

System.out.println("The current name is "+name);
System.out.println("The current age is "+currentAge);
System.out.println("The previous age is "+previousAge);
System.out.println("The next age is "+ nextAge);

}
}
