import java.util.*;
class AreaofRectangle
{
	public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Length:");
	int l = s.nextInt();
	System.out.println("Enter the width:");
	int w = s.nextInt();
	int a = l*w;
	System.out.println("Area of the Rectangle:"+a);
}
}