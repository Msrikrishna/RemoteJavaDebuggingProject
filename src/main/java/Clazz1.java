import java.util.Random;

public class Clazz1 {
    private int a;

    public Clazz1(int a) {
        this.a = a;
    }

    public int randomNumber() {
        Random r = new Random();
        return r.nextInt();
    }
}
