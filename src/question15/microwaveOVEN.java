package question15;
import java.util.Scanner;
public class microwaveOVEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int i;
   float t;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number of Items");
   i=sc.nextInt();
   System.out.println("Enter the single item heating time ");
   t=sc.nextFloat();
   if(i==1)
   {
	   System.out.println(t);
   }
   else if(i==2)
   {
	   t=(float)(1.5*t);
	   System.out.println(t);
   }
   else if(i==3)
   {
	   System.out.println(2*t);
   }
   else
   {
	   System.out.println("Number of items is more");
   }
   
	}

}
