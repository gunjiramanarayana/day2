package question8;
import java.util.Scanner;
public class LABallocation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x,y,z;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter X");
	     x=sc.nextInt();
	     System.out.println("Enter Y");
	     y=sc.nextInt();
	     System.out.println("Enter Z");
	     z=sc.nextInt();
	     if(x<y && x<z)
	     {
	    	 System.out.println("L1 has the minimal seating capasity");
	     }
	     else if(y<x && y<z)
	     {
	    	 System.out.println("L2 has the minimal seating capasity");
	     }
	     else
	     {
	    	 System.out.println("L3 has the minimal seating capasity");
	     }
	}

}
