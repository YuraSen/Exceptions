package task1;

public class Main {
    public static void main(String[] args) {
        f(null);
    }

    public static void f(NullPointerException e){
        try {
            throw e;
        }catch (NullPointerException e1){
            f(e1);
        }
    }
}
