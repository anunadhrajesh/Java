import java.util.Scanner;  
class Box
{
int width;  int height;  int depth;
void readData()
{
Scanner so=new Scanner(System.in);
System.out.println(" Enter width,height, &depth of a Box");  
width =so.nextInt();
height=so.nextInt();  
depth=so.nextInt();
}
void volume( )
{ System.out.print("Volume of the box is "); 
 System.out.println(width*height*depth);	
} }
class BoxDemo
{ public static void main(String a[])

{	
Box mybox=new Box(); 
 mybox.readData( ); 
 mybox.volume();
}
}