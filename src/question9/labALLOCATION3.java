package question9;
import java.util.Scanner;
public class labALLOCATION3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int x,y,z,n;
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Enter X");
		     x=sc.nextInt();
		     System.out.println("Enter Y");
		     y=sc.nextInt();
		     System.out.println("Enter Z");
		     z=sc.nextInt();
		     System.out.println("Enter N");
		     n=sc.nextInt();
		     if(n>=x && n<y)
		     {
		    	 System.out.println("L1 should be allocated for this class");
		     }
		     else  if(n>=0 && n>=y)
		     {
		    	 System.out.println("L2 should be allocated for this class");
		     }
		     else if(n>=0 && n>=z)
		     {
		    	 System.out.println("L3 should be allocated for this class");
		     }
		     else
		     {
		    	 System.out.println("None of the labs can be allocated");
		     }
	}

}
