import java.util.*;

public class ComputeAreaWithConsoleInput 
{
 public static void main(String args[ ]) throws Exception
{
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the value of radius: ");
 	double radius = input.nextDouble();
 	double area = radius * radius * 3.14159;
	System.out.println("The area for the circle of radius " +radius + " is " + area);
} 
}