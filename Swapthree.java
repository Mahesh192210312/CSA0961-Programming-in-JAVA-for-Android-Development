import java.util.*;
class Swapthree
{
	public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value of n1:");
	int a = s.nextInt();
	System.out.println("Enter the value of n2:");
	int b = s.nextInt();
	int k;
	k=a;
	a=b;
	b=k;
	System.out.println("Value of n2 and n2:"+a+","+b+"");
}
}