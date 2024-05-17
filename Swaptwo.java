import java.util.*;
class Swaptwo
{
	public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value of n1:");
	int f = s.nextInt();
	System.out.println("Enter the value of n2:");
	int b = s.nextInt();
	f = f+b;
	b = f-b;
	f = f-b;
	System.out.println("Value of n1 and n2:"+f+","+b+"");
}
}