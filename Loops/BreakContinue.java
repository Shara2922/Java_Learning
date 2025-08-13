public class BreakContinue {
    public static void main(String[] args) {
        // Print numbers from 1 to 10, skip 5, stop at 8
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // skip 5
            }
            if (i == 8) {
                break; // stop loop
            }
            System.out.println("i = " + i);
        }
    }
}
