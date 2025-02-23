public class SoldOutState extends State{
    GumballMachine machine;

    public SoldOutState(GumballMachine machine){
        this.machine = machine;
    }

    public void insertQuarter(){
        invalidOperation();
    }

    public void ejectQuarter(){
        invalidOperation();
    }

    public void turnCrank(){
        invalidOperation();
    }

    public void dispense(){
        invalidOperation();
    }
}
