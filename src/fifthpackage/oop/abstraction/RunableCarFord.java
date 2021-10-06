package fifthpackage.oop.abstraction;

public class RunableCarFord extends  Car implements Vehicle{
    @Override
    public void move() {
        System.out.println("ford move");
    }

    @Override
    public void strat() {
System.out.println("Ford Start");
    }

    @Override
    public void wheels() {
        System.out.println("ford has 4 wheels");
    }
    // interface (idea) --> implment
}
