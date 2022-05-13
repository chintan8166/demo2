package javaconcept;

public class apple extends ab {

	public static void main(String[] args) {
		
	apple a =new apple();
	a.details();
	a.connectcall();

	}

	@Override
	void connectcall() {
		System.out.println("apple logic to connect call");
		
	}

}
