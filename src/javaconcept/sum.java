//to add two numbers
package javaconcept;

public class sum {
	
	public int sub(int a,int b) {
		int result = a*b;
		return result;
	}
	public int date() {
		int display=12;
		return display;
	}
	
	public void Display() {
		System.out.println("Hello world");
		//return;
	}



	
	public static void main(String[] args) {
	sum obj= new sum();
		//obj.date();
	System.out.println(obj.date());
	//System.out.println(obj.mark());
	obj.Display();
		

				
	}

}
