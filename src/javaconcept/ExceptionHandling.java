package javaconcept;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
int a =10;
int b=0;
int c=a/b;}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Exception is handled");
		}
		catch(NullPointerException a)
		{
			a.printStackTrace();
			
		}
System.out.println("if exception is handle I will be displayed");

// try catch block 
		

	}

}
