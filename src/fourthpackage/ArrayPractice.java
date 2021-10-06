package fourthpackage;

public class ArrayPractice {

    public static void main(String[] args) {
      String name ="Hafida" ;
        System.out.println(name);
        String [] names = {"hafida","lilia","ilyan"};
        System.out.println(names[1]);

        for(int i = 0; i< names.length;i++){
            String dataOnLoop = names[i];
            System.out.println(dataOnLoop);
        }
    }
}
