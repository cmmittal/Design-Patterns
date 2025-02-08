package Structural.Decorator.decorator;

public class FileDataSource implements DataSource{

    @Override
    public String readData(){
        System.out.println("Reading Data from file");
        return "Sample Data";
    }

    @Override
    public void writeData(String data){
        System.out.println("Writing Data to file");
    }
}
