import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your marks");
	   int  n=sc.nextInt();
		  if(n<=30)
		  {
		     System.out.println("your grade is: F");  
		  }
		  
		  else if(n<=40)
		  {
		     System.out.println("your grade is: E"); 
		  }
		  else if(n<=50)
		  {
		     System.out.println("your grade is: D"); 
		  }
		  else if(n<=60)
		  {
		     System.out.println("your grade is: C"); 
		  }
		  else if(n<=70)
		  {
		     System.out.println("your grade is: B"); 
		  }
		  else if(n<=80)
		  {
		     System.out.println("your grade is: B+"); 
		  }
		  else if(n<=90)
		  {
		     System.out.println("your grade is: A"); 
		  }
		  else if(n<=100)
		  {
		     System.out.println("your grade is: A+"); 
		  }
		  else 
		  {
		     System.out.println("your enter def"); 
		  }
	}
	
}
