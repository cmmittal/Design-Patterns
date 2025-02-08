package Structural.Decorator.decorator;

public class CompressionDecorator extends DataSourceDecorator{

    public CompressionDecorator(DataSource source){
        super(source);
    }

    @Override
    public String readData(){
        return extractData(super.readData());
    }

    @Override
    public void writeData(String data){
        super.writeData(compressData(data));
    }


    public String compressData(String data){
        System.out.println("Compressing Data.............");

        return data;
    }

    public String extractData(String data){
        System.out.println("Extracting the data..........");

        return data;
    }
}
