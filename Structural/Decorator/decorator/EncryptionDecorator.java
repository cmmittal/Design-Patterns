package Structural.Decorator.decorator;

public class EncryptionDecorator extends DataSourceDecorator{

    public EncryptionDecorator(DataSource source){
        super(source);
    }

    @Override
    public String readData(){
        return decrypt(super.readData());
    }

    @Override
    public void writeData(String data){
        super.writeData(encrypt(data));
    }

    public String decrypt(String data){
        System.out.println("Decrypting of data ...........");
        return data;
    }

    public String encrypt(String data){
        System.out.println("Encrypting the data...........");

        return data;
    }
}
