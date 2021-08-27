package question2;
import java.util.*;
public class vowelORconsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    char ch;
    Scanner sc=new Scanner(System.in);
    ch=sc.next().charAt(0);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    {
    	System.out.println(ch+"is vowel");
    }
    else if(ch>='a'&&ch<='z' || ch>='A'&&ch>='Z')
    {
    	System.out.println(ch+"is consonant");
    }
    else
    {
    	System.out.println("not an alphabet");
    }
    	
	}

}
