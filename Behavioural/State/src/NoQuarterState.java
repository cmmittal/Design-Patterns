public class NoQuarterState extends State{
    GumballMachine machine;

    public NoQuarterState(GumballMachine machine){
        this.machine = machine;
    }

    public void insertQuarter(){
        System.out.println("Quarter Inserted");
        machine.setState(new HasQuarterState(machine));
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
