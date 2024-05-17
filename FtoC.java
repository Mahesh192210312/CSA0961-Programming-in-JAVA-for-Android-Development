import java.util.*;
class FtoC{ 
    public static void main(String[] args) 
    {   
        Scanner sc=new Scanner(System.in);
        double celsius , fahrenheit;
        System.out.println("enter fahrsenheit: ");
        fahrenheit=sc.nextInt(); 
        celsius=(fahrenheit-32)*0.556; 
        System.out.println( "value of temperature in Celsius:"+ celsius); 
    } 
}