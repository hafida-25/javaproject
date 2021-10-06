package thirdpackage;

public class ObjectCreationExecution {
    public static void main(String[] args) {
        //classThat youCateObjectOF ObjectName/ReferenceVariable = new nameOfTheClass()
        Laptop laptop = new Laptop();
       // laptop.printModelOfLaptop();

       // int year = laptop.getYearOfLaptop();
      //  System.out.println(year);

       // laptop.printDetailsOfLaptop();
        Laptop laptop2= new Laptop(2025);
        laptop2.printDetailsOfLaptop();

        Laptop laptop3= new Laptop(2025,"Asus");
         laptop3.printDetailsOfLaptop();

         //what gets executed first? method or a constructor
        // --> is a constructor
    }
}
