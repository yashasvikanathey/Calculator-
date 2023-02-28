import java.util.Scanner;

public class UserInput {
    private final Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getOperation() {
        System.out.println("Enter operation (add, subtract, multiply, divide, sum, variance, stddev, exit):");
        String[] operations = {"add", "subtract", "multiply", "divide", "sum", "variance", "stddev", "exit"};
        String nextOperation = scanner.nextLine().toLowerCase();
        do{
            if (nextOperation.isEmpty()){
                nextOperation = scanner.nextLine().toLowerCase();
            }
            else{
                break;
            }
        }
        while(true);
        return nextOperation;
    }

    public double getDouble() {
        System.out.println("Enter a number:");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Enter a number:");
            scanner.next();
        }
        double d = scanner.nextDouble();
        return d;
    }

    public double[] getDoubleArray() {
        System.out.println("Enter array length:");
        int length = scanner.nextInt();

        double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter element " + (i + 1) + " of " + length + ":");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Enter element " + (i + 1) + " of " + length + ":");
                scanner.next();
            }
            array[i] = scanner.nextDouble();
        }

        return array;
    }
}
