package design_patterns.Singleton;
import java.io.*;
import java.lang.reflect.*;

public class SingletonDesignPattern{

    public static void main(String[] args) throws Exception {

        //Treasure t1 = new Treasure(); Not allowed

        Treasure t1 = Treasure.getTeasure();
        Treasure t2 = null;

//        try {
//            Constructor<Treasure> c = Treasure.class.getDeclaredConstructor();
//            c.setAccessible(true);
//            t2= (Treasure)c.newInstance();  //Singleton pattern is lost here when called using reflection API
//
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        } catch (InvocationTargetException e) {
//            throw new RuntimeException(e);
//        } catch (InstantiationException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }

        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("text.txt"));
        o.writeObject(t1);
        o.close();

        ObjectInputStream i = new ObjectInputStream(new FileInputStream("text.txt"));
        t2 = (Treasure) i.readObject();  //Singleton pattern is lost here during deserialization
        i.close();

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());

    }

}
