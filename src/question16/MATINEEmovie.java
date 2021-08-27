package question16;
import java.util.Scanner;
public class MATINEEmovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int age;
    float time;
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your age");
    age=sc.nextInt();
    System.out.println("Enter show timing");
    time=sc.nextFloat();
    if(age>=13 && time==13.30)
    {
    	System.out.println("The ticket price is $5.00");
    }
    else if(age>=13)
    {
    	System.out.println("The ticket price is $8.00");
    }
    else if(age<13 && time==13.30)
    {
    	System.out.println("The ticket price is $2.00");
    }
    else
    {
    	System.out.println("The ticket price is $4.00");
    }
	}

}
