package fifthpackage.oop.abstraction;

public class LucidAir extends RunableCarFord{

    public static void main(String[] args) {
        LucidAir lucidAir = new LucidAir();
     lucidAir.move();
     lucidAir.wheels();
    }
   // if we want change the result we do like this
      // method overriding --> same method name , same params ,but different class --> dynamic polymorphism / runtime polymorphism

        @Override
        public void move() {
            System.out.println("lucidair move");
        }


}
