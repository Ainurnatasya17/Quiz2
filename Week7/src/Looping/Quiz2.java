package Looping;

public class Quiz2 {

	public static void main(String[] args) {
		//1.
			//For loop
		    System.out.println("1.");
			System.out.println("For: ");
			int max = 5;
			for (int n = 1; n <= max; n++) {
				System.out.println(n);
				    
			}
				
			System.out.println();
				
			//While loop
			System.out.println("While:");
			int i = 1, n = 5;
			while (i <= n) {
				System.out.println(i);
				i++;
					
			}
		        
			System.out.println();
			
				
		//2.
			//For loop
			System.out.println("2.");
			System.out.println("For: ");
			int total = 25;
			for (int number = 1; number <= (total / 2); number++) {
				total = total - number;
			    System.out.println(total + " " + number);
			}
				
			System.out.println();
				
			//While loop
			System.out.println("While: ");
			int totals = 25;
			int num2 = 1;
			while(num2 <= (totals / 2)) {
				totals = totals - num2;
				System.out.println(totals + " " + num2);
				num2++;
			}
				
			System.out.println();
				
				
		//3. 
			//For loop
			System.out.println("3.");
			System.out.println("For: ");
			for (int a = 1; a <= 2; a++) {
			    for (int b = 1; b <= 3; b++) {
			        for (int c = 1; c <= 4; c++) {
			            System.out.print("*");
			           }
				       System.out.print("!");
				  }
				  System.out.println();
			}
			System.out.println();
				
			//While loop
			System.out.println("While: ");
			int a = 1;
			while(a <= 2) {
				a++;
				int b = 1;
				while(b <= 3) {
				b++;
					int c = 1;
					while(c <= 4) {
						c++;
						System.out.print("*");
					}
					System.out.print("!");
				}
				System.out.println();
			 }
			 System.out.println();
				
				
		//4.
			//For loop
			System.out.println("4.");
			System.out.println("For: ");
			int number = 4;
			for (int count = 1; count <= number; count++) {
			    System.out.println(number);
			    number = number / 2;
			}
		    System.out.println();
				
			//While loop
			System.out.println("While: ");
	        int num1 = 4;
	        int count = 1;
		    while(count <= num1) {
	        	count++;
	        	System.out.println(num1);
	        	num1 = num1/2;
		    }
		        
		} //end of main
			
  } //end of class
