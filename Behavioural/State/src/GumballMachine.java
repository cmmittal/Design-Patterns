public class GumballMachine {

    public State state;

    public int count = 0;

    public GumballMachine(int count){
        this.count = count;
        this.state = new NoQuarterState(this);
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall(){
        System.out.println("Gumball released");
        count--;
    }

    public void setState(State state){
        this.state = state;
    }
}
