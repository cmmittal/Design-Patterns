package Structural.Decorator.client;

import Structural.Decorator.decorator.CompressionDecorator;
import Structural.Decorator.decorator.DataSourceDecorator;
import Structural.Decorator.decorator.EncryptionDecorator;
import Structural.Decorator.decorator.FileDataSource;

public class App {

    public static void main(String[] args) {

        DataSourceDecorator decorator = new EncryptionDecorator(
                                        new CompressionDecorator(
                                            new FileDataSource()
                                        )
                                    );
    
        String dataset = "I Love Design Patterns";

        decorator.writeData(dataset);

        decorator.readData();
    }
}
