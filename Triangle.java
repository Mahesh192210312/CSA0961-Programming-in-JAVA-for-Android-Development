import java.util.*;
class Triangle
{
 public static void main(String ar[])
 {
   Scanner sc=new Scanner(System.in);
   double A,b,h;
   System.out.println("enter b: ");
   b=sc.nextInt();
   System.out.println("enter h: ");
   h=sc.nextInt();
   A=0.5*b*h;
   System.out.println("AREA OF TRIANGLE :"+A);
 }
}