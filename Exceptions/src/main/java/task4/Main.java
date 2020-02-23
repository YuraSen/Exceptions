package task4;

public class Main {
    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative size w: " + width + "H:" + height);
        }
        return width*height;
    }
}
