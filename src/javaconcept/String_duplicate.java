package javaconcept;

public class String_duplicate{
	
	public static void main(String[]args) {
		
		
		int [] dup = new int[] {1,2,3,4,2,6,7,6,5};
		System.out.println("duplicate numbers:");
		
		for(int i=0;i<dup.length;i++)
		{
			for(int j=i+1;j<dup.length;j++)
			{
				if(dup[i]==dup[j])
				{
					System.out.println(dup[j]);
				}
					}
			}
		}
		
		
		
		
	
	}
	
	
	
