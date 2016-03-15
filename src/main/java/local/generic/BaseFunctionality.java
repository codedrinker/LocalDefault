package local.generic;

/**
 * Created by codedrinker on 3/13/16.
 */
public class BaseFunctionality<T extends Entity> {
    T entity;

    public T testDynamicReturn() {
        Class<?> aClass;
        T o = null;
        try {
            System.out.println(entity.getClass().getName());
            aClass = Class.forName(entity.getClass().getName());
            o = (T) aClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return o;
    }
}
