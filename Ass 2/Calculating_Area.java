class Calculating_Area{
public static void main(String args[]){
//System.out.println("entering data for the calculation of area of rectangle");
float length = 23f;
float breadth = 20f;

//System.out.println("entering data for the calculation of area of circle");
float r = 3.4f;

//System.out.println("entering data for the calculation of area of triangle");
float base = 13.5f;
float height = 23.2f;

//System.out.println("calcuation part");

float area_Rectangle = length*breadth;
float area_Circle = (float)Math.PI * r *r;
float area_Triangle = 0.5f*base*height;

System.out.println("displaying the output");
System.out.println("Area of rectangle "+area_Rectangle);
System.out.println("Area of Circle "+area_Circle);
System.out.printf("Area pf triangle is %.2f",area_Triangle);



}
}

