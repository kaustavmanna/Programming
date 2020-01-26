/**
 * @author kaustavmanna
 *
 */
import java.util.BitSet;
import java.util.Scanner;

public class Problem_2
{
	public static void main(String[] args)
	{
		 Scanner in = new Scanner(System.in);
	     int length = in.nextInt();
	     
	     BitSet B1 = new BitSet(length);
	     BitSet B2 = new BitSet(length);
	     
	     int n = in.nextInt();
	     for(int i = 0; i < n; i++)
	     {
	    	 String command = in.next();
	    	 int first = in.nextInt();
	    	 int second = in.nextInt();
	    	 
	    	 if(command.equals("AND"))
	    	 {
	    		 if(first == 1)
	    			 B1.and(B2);
	    		 else
	    			 B2.and(B1);
	    		 System.out.println("Code was here");
	    	 }
	         
	    	 else if(command.equals("OR"))
	         {
	    		 if(first == 1)
	    			 B1.or(B2);
	             else
	            	 B2.or(B1);
	         }
	         else if(command.equals("XOR"))
	         {
	             if(first == 1)
	                 B1.xor(B2);
	             else
	                 B2.xor(B1);
	         }
	         else if(command.equals("FLIP"))
	         {
	             if(first == 1)
	                 B1.flip(second);
	             else
	                 B2.flip(second);
	         }
	         
	         else if(command.equals("SET"))
	         {
	             if(first == 1)
	                 B1.set(second, true);
	             else
	                 B2.set(second, true);
	             System.out.println("Code was here!");
	         }

	         System.out.println(B1.cardinality() + " " + B2.cardinality());
	     }
	     in.close();
	}
}
