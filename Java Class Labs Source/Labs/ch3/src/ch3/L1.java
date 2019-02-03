package ch3;

public class L1 {

	public static void main(String[] args) {
		int min = 0;
		int max = args.length - 1;
		int index = min;
		/*
		 * for(index = min; index <= max; index++) { System.out.println(args[index]); }
		 */
						
		while(index <= max) {
			System.out.println(args[index]);
			index++;
		}
	}

}
