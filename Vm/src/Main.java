	import java.util.InputMismatchException;
	import java.util.Scanner;
	public class Main {
	    public static void main(String[] args) {
	        Scanner keyboard = new Scanner(System.in);
	        int choice=0;
	        System.out.println("\n\nplease enter your selection:"
	        		+ "\n1:coke\t 125"
	        		+"\n2:pizza\t 200"
	        		+"\n3:breezer\t150"
	        		+"\n4:pasta\t 130"
	        		+"\n5:fries\t 100");
	        double[] itemPrices = {125, 200, 150, 130, 100};
	        int maxItem = itemPrices.length;	        
	        boolean itemFound = false;	        
	        Integer item = null;
	        do {
	            System.out.print("Enter an item number: ");
	            try {
	                item = keyboard.nextInt();
	                if ( item >= 1 && item <= maxItem ) {
	                    itemFound = true;
	                } else {
	                   
	                    String message = String.format("Unfortunately, item #%d does not exist.", item);
	                    System.out.println(message);
	                }

	            
	            } catch (InputMismatchException e) {
	                System.out.println("Bad input. Try again.");
	                keyboard.next();
	            }
	        } while (!itemFound);


	        Double paid = null;
	        do {
	            System.out.print("Enter the amount paid: ");
	            try {
	                paid = keyboard.nextDouble();
	            } catch (InputMismatchException e) {
	                System.out.println("Bad input. Try again.");
	                keyboard.next();
	            }
	        } while (paid == null);

	        double itemValue = itemPrices[item-1];

	        double change = paid - itemValue;

	        double moneyNeeded = 0 - change;

	        if ( moneyNeeded > 0 ) {
	          
	            String message = String.format("Please insert another %.2f.%n", moneyNeeded);
	            System.out.println(message);
	            System.exit(0);
	        }

	        String message = String.format("Thank you for buying item #%d, your change is %.2f. Please come again!", item, change);

	        System.out.println(message);
	    }

	}
