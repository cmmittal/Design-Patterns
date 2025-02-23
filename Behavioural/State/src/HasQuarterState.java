public class HasQuarterState extends State{
    GumballMachine machine;

    public HasQuarterState(GumballMachine machine){
        this.machine = machine;
    }

    public void insertQuarter(){
        invalidOperation();
    }

    public void ejectQuarter(){
        System.out.println("Quarter Eject Success");
        machine.setState(new NoQuarterState(machine));
    }

    public void turnCrank(){
        System.out.println("Crank turned .......");
        machine.setState(new SoldState(machine));
    }

    public void dispense(){
        invalidOperation();
    }
}
