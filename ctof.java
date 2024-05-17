import java.util.*;
class ctof{ 
    public static void main(String[] args) 
    {   
        Scanner sc=new Scanner(System.in);
        double celsius = 10.0, fahrenheit = 0.0;
        System.out.println("enter celsius: ");
        celsius=sc.nextInt(); 
        fahrenheit = (celsius * 1.8) + 32; 
        System.out.println( " value of temperature in fahrenheit:"+ fahrenheit); 
    } 
}