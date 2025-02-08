package Structural.Decorator.decorator;

public abstract class DataSourceDecorator implements DataSource{

    DataSource wrapee;

    public DataSourceDecorator(DataSource source){
        this.wrapee = source;
    }

    @Override
    public String readData(){
        return wrapee.readData();
    }

    @Override
    public void writeData(String data){
        wrapee.writeData(data);
    }
}
