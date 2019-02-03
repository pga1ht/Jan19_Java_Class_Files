package ch3;



public class L3 {

	public static void main(String[] args) {
		int min = 0;
		int max = args.length - 1;
		int index = min;
		
		if (args.length == 0) {
			System.out.println("You must enter at least one method");
			System.exit(-1); //end run with error
		}
		
		  for(index = min; index <= max; index++) {
//			  int printNumber = index + 1;
//			  System.out.print(printNumber + " ");
			  if (index < max) {
				  System.out.print((1+index) + " ");  
			  } 
			  
			  
			  
			  
			  
			  else {
				  System.out.print("Last One ");
			  	  }
		      System.out.println(args[index]); 
		}
	}
}

