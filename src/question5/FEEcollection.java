package question5;
import java.util.Scanner;
public class FEEcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String name;
   String MSDS;
   String MSH;
   String MGSDS;
   String MGSH;
   float tf,bf,hf,amount;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the student type");
   name=sc.nextLine();
   if(name==MSDS)
   {
	   System.out.println("Enter tution fee");
	   tf=sc.nextFloat();
	   System.out.println("Enter bus fee");
	   bf=sc.nextFloat();
	   System.out.println("Enter hostel fee");
	   hf=sc.nextFloat();
	   amount=tf+bf;
	   System.out.println(amount);
   }
   else if(name== MSH)
   {
	   System.out.println("Enter tution fee");
	   tf=sc.nextFloat();
	   System.out.println("Enter bus fee");
	   bf=sc.nextFloat();
	   System.out.println("Enter hostel fee");
	   hf=sc.nextFloat();
	   amount=tf+hf;
	   System.out.println(amount);
   }
   else if(name== MGSDS)
   {
	   System.out.println("Enter tution fee");
	   tf=sc.nextFloat();
	   System.out.println("Enter bus fee");
	   bf=sc.nextFloat();
	   System.out.println("Enter hostel fee");
	   hf=sc.nextFloat();
	   amount=(float)((1.5*tf) + bf);
	   System.out.println(amount);
   }
   else if(name==MGSH)
   {
	   System.out.println("Enter tution fee");
	   tf=sc.nextFloat();
	   System.out.println("Enter bus fee");
	   bf=sc.nextFloat();
	   System.out.println("Enter hostel fee");
	   hf=sc.nextFloat();
	   amount=(float)((1.5*tf) + hf);
	   System.out.println(amount);
   }
   else
   {
	   System.out.println("Enter the correct student details");
   }
	}

}
