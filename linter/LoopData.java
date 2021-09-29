package linter;

/**
 * This is a sample Java program to run through the linter.
 */
final class LoopData {

	/**
	 * This method kicks off the program.
	 */
	private LoopData() {

	} //end private constructor

	public static void main(final String[] args) {


		int limit = Integer.parseInt(args[0]);

		while (limit >= 0) {

			System.out.println("Limit: " + limit);
			limit--;
		}
		System.out.println("Done!");

	} //end main

} //end class
