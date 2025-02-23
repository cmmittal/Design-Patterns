public class SoldState extends State{
    GumballMachine machine;

    public SoldState(GumballMachine machine){
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
        System.out.println("Dispensing Gumball .......");
        machine.releaseBall();

        if (machine.count > 0) {
            machine.setState(new NoQuarterState(machine));
        }
        else{
            machine.setState(new SoldOutState(machine));
        }
    }
}
