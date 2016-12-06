package utils;

/**
 * Created by codedrinker on 12/4/16.
 */
public class Singleton {
   private Singleton(){}
    private static Singleton singleton = null;
    public static Singleton getSingleton(){
        if (singleton==null){
            synchronized(Singleton.class){
                if (singleton == null){
                    singleton =  new Singleton();
                }

            }

        }
        return singleton;
    }

}
