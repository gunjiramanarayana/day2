package question14;
import java.util.Scanner;
public class BUDGET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a,b,c,d,e,total;
    Scanner sc=new Scanner (System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    e=sc.nextInt();
    total=(a+b+c+d+e);
    if(total<= 15000)
    {
    	System.out.println("yes");
    }
    else
    {
    	System.out.println("no");
    }
	}

}
