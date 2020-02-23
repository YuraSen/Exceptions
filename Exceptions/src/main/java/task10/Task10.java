package task10;

public class Task10 {
    public static void main(String[] args) {
        try {
            System.err.println("1");
            if (true) {
                throw new RuntimeException();
            }
            System.err.println("2");
        } catch (RuntimeException e) {
            System.err.println("3");
            if (true) {
                throw new Error();
            }

        }
        System.err.println("4");
    }
}
