/**
 * This is a sample Java program to run through the linter.
 */
public class LoopData {

	/**
	 * This method kicks off the program.
	 * @param args - doesn't require arguments.
	 */

	public static void main(String[] args) {


		int limit = Integer.parseInt(args[0]);

		while ( limit >= 0 )
		{

			System.out.println ("Limit: " + limit) ;	
			limit--;
		} 
		
		System.out.println ("Done!") ;

	} //end main

} //end class