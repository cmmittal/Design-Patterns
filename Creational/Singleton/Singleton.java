package Creational.Singleton;

public class Singleton {

    private static Singleton object;
    public String value;

    private Singleton(String value){
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if (object == null) {
            object = new Singleton(value);
        }

        return object;
    }
}
