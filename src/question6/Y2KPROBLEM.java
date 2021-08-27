package question6;
import java.util.Scanner;
public class Y2KPROBLEM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int age,yob,cy;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the year of birth");
     yob=sc.nextInt();
     System.out.println("Enter the current year");
     cy=sc.nextInt();
     if(cy>yob)
     {
    	 age=cy-yob;
    	 System.out.println("your age is"+age);
     }
     else
     {
    	 cy=100+cy;
    	 age=cy-yob;
    	 System.out.println("your age is"+age);
     }
	}

}
