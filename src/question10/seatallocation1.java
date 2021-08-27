package question10;
import java.util.Scanner;
public class seatallocation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int r,c,rn;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of rows");
    r=sc.nextInt();
    System.out.println("enter the number of columns");
    c=sc.nextInt();
    System.out.println("enter the roll number of student");
    rn=sc.nextInt();
    if(rn<=c || rn%c==0 || rn%10==1)
    {
    	System.out.println("yes");
    }
    else
    {
    	System.out.println("no");
    }
	}

}
