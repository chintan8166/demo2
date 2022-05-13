package javaconcept;

import java.util.ArrayList;
import java.util.List;

public class reverse_string {

	public static void main(String[] args) {
	String S1 ="chintan";
	
	StringBuilder Sb = new StringBuilder(S1);
	String S2 = Sb.reverse().toString();
	System.out.println(S2);

	
	System.out.println("String buffer example");
	
	StringBuffer st = new StringBuffer("Chintan");
	st.append(" patel");
	System.out.println(st);
	
	
	
	System.out.println("list array");
	List<String> A = new ArrayList<String>();
	A.add("toronto");
	A.add("ahmedabad");
	A.add("mumbai");
	A.add("paris");
	
	System.out.println(A);
	
	}

}
