// Main.java
// Name: VRAJ PATEL
// PRN: 23070126147
// Batch: AIML-B3

public class Main {
    public static void main(String[] args) {
        
        UserInput userInput = new UserInput();
        int choice;

        do {
            System.out.println("\nSelect a Function:");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Fibonacci\n6. Sum of Array\n7. Mean of Array\n8. Exit");
            choice = userInput.getNumberInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    Calculator.addition();
                    break;
                case 2:
                    Calculator.subtraction();
                    break;
                case 3:
                    Calculator.multiplication();
                    break;
                case 4:
                    Calculator.division();
                    break;
                case 5:
                    Calculator.fibonacci();
                    break;
                case 6:
                    Calculator.sumOfArray();
                    break;
                case 7:
                    Calculator.meanOfArray();
                    break;
                case 8:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 8);
    }
}
