package thirdpackage;

 public class Calculator {
    //main method
    public static void main(String[] args ) {
        doAddition();
         int x =getDataFromMath();
         System.out.println(x+10);
Calculator objectOfCalculator = new Calculator();
        objectOfCalculator.doAddition2();
        objectOfCalculator.getDataFromMath2();
    }
    // static void
    public static void doAddition() {
        int a = 10;
        int b = 20;
        // System.out.println(a+b)
        int c = a + b;
        System.out.println(c);
    }
    // non static void
    public void doAddition2() {
        int a = 10;
        int b = 20;
        // System.out.println(a+b)
        int c = a + b;
        System.out.println(c);
    }
    // static return type
        public static int getDataFromMath(){

            int a = 10;
            int b = 20;
            // System.out.println(a+b)
            int c = a + b;
            System.out.println(c+"getDataFromMath");
            return c;
        }
        // non static return type
    public int getDataFromMath2(){

        int a = 10;
        int b = 20;
        // System.out.println(a+b)
        int c = a + b;
        System.out.println(c+"getDataFromMath");
        return c;
    }





    }


