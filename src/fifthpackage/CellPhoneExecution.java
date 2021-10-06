package fifthpackage;

public class CellPhoneExecution {
    public static void main(String[] args){
        CellPhone cellPhone = CellPhone.getInstance();
        CellPhone cellPhone2 = CellPhone.getInstance();

        cellPhone.printMyPhone();
        cellPhone2.printMyPhone();
    }
}
