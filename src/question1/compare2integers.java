package question1;
import java.util.Scanner;
public class compare2integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n1,n2;
    Scanner sc=new Scanner(System.in);
    n1=sc.nextInt();
    n2=sc.nextInt();
    if(n1==n2)
    {
    	System.out.println(n1+"is qual to"+n2);
    }
    	else if(n1>n2)
    {
    	System.out.println(n1+"is greater than"+n2);
    }
    else
    {
    	System.out.println(n1+"is lesser than"+n2);
    }
    
	}

}
