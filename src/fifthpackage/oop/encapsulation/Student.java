package fifthpackage.oop.encapsulation;

public class Student {
    // encapsulation : data hiding
    private String name;
    private int id;
  // setter method
    public void setName(String nameFromMethod){
        this.name= nameFromMethod;
    }
    public void setId(int idFromMethod){
        this.id=idFromMethod;
    }

    //getter method
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
// go to generac and chose to string
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
