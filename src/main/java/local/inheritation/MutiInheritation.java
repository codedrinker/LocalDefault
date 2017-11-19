package local.inheritation;

/**
 * Created by codedrinker on 19/11/2017.
 */
public class MutiInheritation {
    /**
     * public final class Byte
     * public final class Character
     * public static final class Character.UnicodeBlock
     * public final class Class<T>
     * public final class Compile
     * public final class Double
     * public final class Float
     * public final class Integer
     * public final class Long
     * public final class Math
     * public final class ProcessBuilder
     * public final class RuntimePermission
     * public final class Short
     * public final class StackTraceElement
     * public final class StrictMath
     * public final class String
     * public final class StringBuffer
     * public final class StringBuilder
     * public final class System
     * public final class Void
     */

    class NumberIneritation extends Number {

        @Override
        public int intValue() {
            return 0;
        }

        @Override
        public long longValue() {
            return 0;
        }

        @Override
        public float floatValue() {
            return 0;
        }

        @Override
        public double doubleValue() {
            return 0;
        }
    }

    //can not extends final class
//    class DoubleIneritation extends Double {
//        public DoubleIneritation(double value) {
//            super(value);
//        }
//    }
    class ThreadIneritation extends Thread {
    }

    class ClassLoaderIneritation extends ClassLoader {
    }

}
