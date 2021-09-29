public class LoopData{


	public static void main(String[] args){


		int limit = Integer.parseInt(args[0]);

		while(limit>=0){

			System.out.println("Limit: " + limit);	
			limit--;
		}
		
		System.out.println("Done!");

	}//end main

}//end class