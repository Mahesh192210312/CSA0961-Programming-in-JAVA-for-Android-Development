import java.util.*;
class Sphere
{
	public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Radius:");
	int f = s.nextInt();
	double a = ((3.14)*(1.33)*f*f*f);
	System.out.println("Volume of the Sphere:"+a);
}
}