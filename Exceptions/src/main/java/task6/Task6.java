package task6;

public class Task6 {
    public static void main(String[] args) {
        System.err.println("1#.in");
        f();
        System.err.println("1#.out");
    }
    public static void f(){
        System.err.println("2#.in");
        try {
            g();
        }catch (Error error){
            System.err.println("2#.catch");
        }
        System.err.println("2#.out");
    }
    public static void g(){
        System.err.println("3#.in");
        h();
        System.err.println("3#.out");
    }
    public static void h(){
        System.err.println("4#.in");
        if(true){
            System.err.println("4#.throw");
            throw new Error();
        }
        System.err.println("4#.out");
    }
}
