package question3;
import java.util.Scanner;
public class Annauniversitygrading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int m;
   Scanner sc=new Scanner(System.in);
   m=sc.nextInt();
   if(m==100)
   {
	   System.out.println("S");
   }
   else if(m>=90 && m<99)
   {
	   System.out.println("A");
   }
   else if(m>=80 && m<89)
   {
	   System.out.println("B");
   }
   else if(m>=70 && m<79)
   {
	   System.out.println("C");
   }
   else if(m>=60 && m<69)
   {
	   System.out.println("D");
   }
   else if(m>=50 && m<59)
   {
	   System.out.println("E");
   }
   else if(m>=0 && m<50)
   {
	   System.out.println("F");
   }
   else 
   {
	   System.out.println("Invalid input");
   }
	}

}
