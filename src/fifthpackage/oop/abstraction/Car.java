package fifthpackage.oop.abstraction;

public abstract class Car {
    //method with body as weel as method without body
// abstract class can have constructor
    // still doesn't allow to create the object directly
    // you can onley extend one abstract class in regular class as well
    public void brake(){
        System.out.println("car has to stop bia this ");
    }

    // if a method need to be working as concept you need to use the keyword abstract
    // abstract method --> concept

  public abstract void wheels();

}
