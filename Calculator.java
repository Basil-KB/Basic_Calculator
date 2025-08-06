import java.util.Scanner;

public class Calculator {

// Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalc = true;
		double numOne;
		double numTwo;
		double result = 0;
		int choice;
		char continueOperation;
		
        while (continueCalc) {
            System.out.println("\n--- Simple Calculator ---");
            System.out.println("Choose operation: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("Enter choice (1-4): ");
            choice = scanner.nextInt();

            
		
			if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice!");
                // skip operation and go to continue prompt
			}else{
				// Get user input for numbers
				System.out.print("Enter first number: ");
				numOne = scanner.nextDouble();
				System.out.print("Enter second number: ");
				numTwo = scanner.nextDouble();
				
				// Perform chosen operation
				
				switch (choice) {
					case 1:
						result = add(numOne, numTwo);
						break;
					case 2:
						result = subtract(numOne, numTwo);
						break;
					case 3:
						result = multiply(numOne, numTwo);
						break;
					case 4:
						result = divide(numOne, numTwo);
						break;
					default:
						System.out.println("Invalid choice!");
						continue;
				}
			

				System.out.println("Result: " + result);
			}
			
			System.out.print("Do you want continue the Operation, choice( Y/N )  ");
			continueOperation = scanner.next().charAt(0);
			if (continueOperation == 'n' || continueOperation == 'N') {
                continueCalc = false;
                System.out.println("Exiting calculator. Goodbye!");
                continue;
            }else if(continueOperation == 'y' || continueOperation == 'Y')
				continueCalc = true;
			else{
				continueCalc = false;
				System.out.println("Invalid Entry,Exiting calculator. Goodbye!");		
			}
        }

        scanner.close();
    }
}