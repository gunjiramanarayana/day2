package question12;
import java.util.Scanner;
public class HOTELTARIFF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int month,days;
    float rent,amount;
    Scanner sc=new Scanner(System.in);
    month=sc.nextInt();
    switch(month)
    {
    case 4:
    case 5:
    case 6:
    case 11:
    case 12: rent=sc.nextFloat();
             days=sc.nextInt();
    	     amount=(float)((1.2*rent)*days);
             System.out.println("Hotel Tariff: Rs." +amount);
             break;
    case 1:
    case 2:
    case 3:
    case 7:
    case 8:
    case 9:
    case 10: rent=sc.nextFloat();
             days=sc.nextInt();
    	     amount=(rent*days);
             System.out.println("Hotel Tariff: Rs." +amount);
             break;
    default: System.out.println("Invalid input");
    }
    
	}

}
