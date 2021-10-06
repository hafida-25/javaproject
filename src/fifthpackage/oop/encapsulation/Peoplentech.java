package fifthpackage.oop.encapsulation;

public class Peoplentech {
    public static void main(String[] args) {

        Student hafida = new Student();
        hafida.setName("Hafedha iouelhadjen");
        hafida.setId(1234566);
        System.out.println(hafida.getName());

        Student ghani = new Student();
       ghani.setName("ghani haddad");
        ghani.setId(123445);
        System.out.println(ghani.getName());
        System.out.println(ghani.getId());


    }

}

