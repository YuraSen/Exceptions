package task8;

public class Main {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch (Exception e){
            if (e instanceof RuntimeException){
                RuntimeException runtimeException = (RuntimeException) e;
                System.err.println("it`s RTE");
            }else {System.err.println("wtf, its RTE?");}
        }
    }
}
