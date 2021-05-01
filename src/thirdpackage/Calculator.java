package thirdpackage;

public class Calculator {public Calculator() {
}
    // main method

    public static void main(String[] args) {
        doAddition() ;
        int x = getDataFromMath();
        Calculator objectOfCalculator = new Calculator();
        objectOfCalculator.doAddition2();
        objectOfCalculator.getDataFromMath2();

    }

    //static void
    public static void doAddition() {
        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println(c+" from doAddition");
    }
//non static void

    public void doAddition2() {
        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println(c);
        System.out.println(c+" from doAddition2");
    }

    // static return type
    public static int getDataFromMath() {
        int a = 10;
        int b= 20;
        int c=a+b;
        System.out.println(c+"getDataFromMath ");
        return c;}

    // non static return type
    public int getDataFromMath2() {
        int a = 10;
        int b= 20;
        int c=a+b;
        System.out.println(c+"getDataFromMath2 ");
        return c;
    }

    public void doMath(int a,int b) {
        System.out.println(a+b);
    }
    public void doMath(int a, int b ,int c) {
        int x = a+b;
        int z =x-c;
        System.out.println(z);
    }
    public void doMath(int a, int b ,String data) {
        System.out.println(a+b+data);
    }
}




}

