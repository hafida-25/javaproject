package thirdpackage;

public class Laptop {
    //defaultConstructor
    //accessSpecifier sameNameOfTheClass(){--constructor starts
    //constructor body
    // } -->constructor ends
    //defaultConstructor
    public Laptop() {

    }

    //parameterized Constructor
    public Laptop(int yearFromConstructor) {
        System.out.println(" our new constructor is being executed");
        this.year = yearFromConstructor;
    }

    public Laptop(String modelFromConstructor) {
        this.model = modelFromConstructor;
    }

    public Laptop(int yearFromConstructor, String modelFromConstructor) {

        this.year = yearFromConstructor;
        this.model = modelFromConstructor;
    }

    // global variable / class level variable
    int year;
    String model;

    public void printModelOfLaptop() {
        //local variables / method level variable--> they belongs to this method only
        String model = "MacBook pro";
        System.out.println("model");

    }

    public int getYearOfLaptop() {
        return year;
    }

    public void printDetailsOfLaptop() {
        System.out.println("laptop year is " + year);
        System.out.println("laptop model  is " + model);
    }
}
