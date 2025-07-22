package design_patterns.Singleton;

import java.io.Serializable;

public class Treasure  implements Serializable {

    private volatile static Treasure treasure; //This will be the single object that can be used by others, this is achieving singleton

    private Treasure() throws Exception {
        if(treasure!=null){
            throw new Exception("Object already exists");  // This handles the breaking of singleton class using Reflection API
        }
    } //Made the constructor as private to achieve Singleton

    public static Treasure getTeasure() throws Exception {
        if(treasure == null){
            synchronized (Treasure.class){  //synchronized for thread safety
                if(treasure == null){
                    treasure  = new Treasure();
                }
            }

        }
        return treasure;
    }

     Object readResolve() throws Exception {  // This method is called during deserialization process, this will enforce singleton pattern during deserialization.
        return getTeasure();
    }
}
