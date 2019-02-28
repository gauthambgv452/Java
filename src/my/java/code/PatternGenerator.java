package my.java.code;

public class PatternGenerator {   
	 
	public static void main(String args[]) {
	    
		for(int a=1;a<=10;a++)
		{
			String s=Integer.toString(a); 			
			System.out.println("\n");
			
		 	for(int i=1;i<=a;i++)			
	 	    	{	
					for(int j=1;j<=i;j++)	
				 	{
						System.out.print(s);
					}
					if(i<=a-1)
						System.out.print("+");
	 	    	}
	    } 
	}
}
