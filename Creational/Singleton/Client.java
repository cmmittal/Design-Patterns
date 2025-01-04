package Creational.Singleton;

public class Client {

    public static void main(String[] args){
        Singleton obj1 = Singleton.getInstance("Obj1");

        Singleton obj2 = Singleton.getInstance("Obj2");

        System.out.println(obj1.value);

        System.out.println(obj2.value);
    }
}
