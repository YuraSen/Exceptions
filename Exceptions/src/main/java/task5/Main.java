package task5;

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("error");
        }catch (MyException e){
            System.out.println("1");
        }
        catch (RuntimeException e) {
            System.out.println("warnings");
        }finally {
            System.out.println("finally");
        }
    }
}

