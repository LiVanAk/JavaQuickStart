package encapsulation.extend;

public class Pupil extends Student {
    Pupil() {
        super("novi");
    }
    public void testing() {
        System.out.println("Puipil " + name + " is doing primary school homework.");
    }
}
