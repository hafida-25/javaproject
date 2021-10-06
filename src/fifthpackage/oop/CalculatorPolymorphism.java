package fifthpackage.oop;

public class CalculatorPolymorphism {

    // polymorphism : having many forms
    // method overloading --> same method name ,different params, in the same class
    // static polymorphism / compile time polymorphism
    public static void main(String[] args) {

        int x = calculator(10,20);
        System.out.println(x);

        int y= calculator(10,20,30);
        System.out.println(y);
    }

    public static int calculator(int a,int b){
        return a+b;
    }

    public static int calculator (int a,int b,int c){
        return a+b+c;
    }
   // method overriding --> in the abstraction package
}
