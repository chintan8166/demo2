package javaconcept;

public class Child extends Parent{
	public void details() {
		System.out.println("details from child");
	}
public void job()
{
	System.out.println("My job is QA");
	}
	public static void main(String[] args) {
		
		
Parent obj= new Child();// top casting		
//Child obj1=new Child();
//obj.details();
obj.details();

// method overriding

		
	}

}
