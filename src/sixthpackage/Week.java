package sixthpackage;

public class Week {
    private Days days;

    public Week(Days days) {
        this.days = days;
    }

    public void whatToDo() {
        switch (days) {
            case Friday:
                System.out.println(" i'll play Cricket");
                break;

            case Saturday:
                System.out.println(" i'll play SOCCER");
                break;
            case Sunday:
                System.out.println(" i'll play CRICKET");
                break;
            case Thursday:
                System.out.println(" i'll play guiter");
                break;
            default:
                System.out.println("i'll go to work");
        }


    }
}
