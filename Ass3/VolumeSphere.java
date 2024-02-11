class Volume_Sphere{
public static void main(String arg[])
{

float radius = Float.parseFloat(arg[0]);

float volume = 4/3f*(float)Math.PI*radius*radius*radius;
float area = 4*(float)Math.PI*radius*radius;

System.out.println(volume);
System.out.println(area);




}
}
