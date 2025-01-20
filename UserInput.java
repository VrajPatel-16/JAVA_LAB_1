import java.util.Scanner;

public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    // Function to get number input from user
    public int getNumberInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to get an array input from  user
    public int[] getArrayInput(String prompt, int size) {
        System.out.println(prompt);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " +(i + 1)+ ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
