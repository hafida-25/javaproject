package fifthpackage.oop.inheritance;

public class B extends  A{
    public void methodFromB(){
        System.out.println("method from B");
    }

    public static void main(String[] args) {
        B b = new B();
        b.methodFromA();
        b.methodFromB();
    }
}
