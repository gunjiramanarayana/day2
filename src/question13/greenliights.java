package question13;
import java.util.Scanner;
public class greenliights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    float s,d,t,current;
    Scanner sc=new Scanner(System.in);
    s=sc.nextFloat();
    d=sc.nextFloat();
    t=sc.nextFloat();
    current=(s*d);
    	if(current>t)
    	{
    		System.out.println("yes");
    	}
    	else
    	{
    		System.out.println("no");
    	}
	}

}
