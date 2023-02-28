import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput(scanner);
        Calculator calculator = new Calculator();
        //Get an operation from the user    
        while (true) {
            String operation = userInput.getOperation();
            if (operation.equals("exit")) {
                break;
            }

            double result = calculator.calculate(operation, userInput);
            if (result != Double.NaN) {
                System.out.println("Result: " + result);
            }
        }
    }
}
