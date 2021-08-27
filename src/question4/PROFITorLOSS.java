package question4;
import java.util.Scanner;
public class PROFITorLOSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    float n1,n2,loss,profit,equal,k,l;
    Scanner sc=new Scanner(System.in);
    n1=sc.nextFloat();
    n2=sc.nextFloat();
    k=n2*12;
    if(k==n1)
    {
    	System.out.println("No profit No loss");
    }
    else if(k>n1)
    {
    	System.out.println("Profit:Rs. "+(k-n1));
    }
    else
    {
    	System.out.println("Loss :Rs.%.02f"+(n1-k));
    }
	}

}
