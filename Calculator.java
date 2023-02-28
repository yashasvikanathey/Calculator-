public class Calculator {
    public double calculate(String operation, UserInput userInput) {
        switch (operation) {
            case "add":{
               return add(userInput.getDouble(), userInput.getDouble()); 
            }
            case "subtract":{
                return subtract(userInput.getDouble(), userInput.getDouble());
            }    
            case "multiply":{
                return multiply(userInput.getDouble(), userInput.getDouble());
            }
            case "divide":{
                return divide(userInput.getDouble(), userInput.getDouble());
            }
            case "sum":{
                return sum(userInput.getDoubleArray());
            }
            case "variance":{
                return variance(userInput.getDoubleArray());
            }
            case "stddev":{
                return standardDeviation(userInput.getDoubleArray());
            }
            default:{
                System.out.println("Invalid operation.");
                return Double.NaN;
            }
        }
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double sum(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        return sum;
    }

    public double variance(double[] array) {
        double sum = 0;
        double sumSquared = 0;
        for (double element : array) {
            sum += element;
            sumSquared += element * element;
        }
        double mean = sum / array.length;
        return sumSquared / array.length - mean * mean;
    }

    public double standardDeviation(double[] array) {
        return Math.sqrt(variance(array));
    }
}
