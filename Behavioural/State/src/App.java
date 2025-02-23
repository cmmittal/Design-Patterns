public class App {
    public static void main(String[] args) throws Exception {
        GumballMachine machine = new GumballMachine(10);

        machine.insertQuarter();
        machine.turnCrank();

        System.out.println();

        machine.insertQuarter();
        machine.ejectQuarter();

        System.out.println();

        machine.ejectQuarter();

        System.out.println();

        machine.turnCrank();
    }
}
