public abstract class State {

    public void invalidOperation(){
        System.out.println("Invalid Operation");
    }
    public abstract void insertQuarter();
    public abstract void ejectQuarter();
    public abstract void turnCrank();
    public abstract void dispense();
}
