package task7;

public class Main {
    public static void main(String[] args) {
        try {
            System.err.println(" 0");
            if (true) {
                throw new RuntimeException();
            }
            System.err.println(" 1");
        } catch (Exception e) {
            System.err.println(" 2");
        }
        System.err.println(" 3");
    }
}
