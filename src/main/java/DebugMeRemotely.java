

public class DebugMeRemotely {
    public static void main(String[] args) {
        System.out.println("Started execution");
        Clazz1 c = new Clazz1(3);
        c.randomNumber();
        c.randomNumber();
        System.out.println("Generated random number:  " + c.randomNumber());
        System.out.println("Generated random number:  " + c.randomNumber());
        System.out.println("Finished execution");
    }
}
