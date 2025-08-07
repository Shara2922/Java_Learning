// ✅ METHOD ARGUMENTS & INPUT PARAMETERS

// Arguments: values you pass to a method
// Parameters: variables listed in method definition

public class Calculator {

    // Method with two input parameters
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // 5 and 10 are arguments
        int result = calc.add(5, 10);

        System.out.println("Sum: " + result);
    }
}
