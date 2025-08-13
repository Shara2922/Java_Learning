// ✅ METHOD ARGUMENTS & INPUT PARAMETERS

// Arguments: values you pass to a method
// Parameters: variables listed in method definition

public class MethodArgumentsExample {

    // Method with two input parameters
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodArgumentsExample calc = new MethodArgumentsExample();

        // 5 and 10 are arguments
        int result = calc.add(5, 10);

        System.out.println("Sum: " + result);
    }
}
