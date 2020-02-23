package task9;

public class Task9 {
    public static void main(String[] args) throws Exception {
        try {
            System.err.println(" 0");
            if (true) {
                throw new Exception("WTF");
            }
            System.err.println("  1");
        } catch (RuntimeException e) {
            System.err.println(" 2");
        }
        System.err.println("3");
    }
}
