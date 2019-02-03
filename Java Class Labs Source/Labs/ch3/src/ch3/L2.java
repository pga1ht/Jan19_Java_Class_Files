package ch3;

public class L2 {

	public static void main(String[] args) {
		int min = 0;
		int max = args.length - 1;
		int index = min;
		/*
		 * for(index = min; index <= max; index++) { System.out.println(args[index]); }
		 */
		if (args.length == 0) {
			System.out.println("You must enter at least one method");
			System.exit(-1); //end run with error
		}
					
		while(index <= max) {
			System.out.println(args[index]);
			index++;
		}
	}

}
