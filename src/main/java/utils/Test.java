package utils;

import org.codehaus.groovy.runtime.powerassert.SourceText;

/**
 * Created by codedrinker on 12/4/16.
 */
public class Test {
    public static void main(String[] args) {
        Singleton singleton =  Singleton.getSingleton();
        Singleton singleton1 =  Singleton.getSingleton();
        System.out.println(singleton);
        System.out.println(singleton);
        System.out.println(singleton1);
    }

}
