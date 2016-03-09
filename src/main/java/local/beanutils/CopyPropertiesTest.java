package local.beanutils;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by codedrinker on 3/9/16.
 */
public class CopyPropertiesTest {
    public static void main(String[] args) {
        CopyFromProperty from = new CopyFromProperty("name", 2);
        System.out.println(from);
        CopyToProperty to = new CopyToProperty();
        try {
            BeanUtils.copyProperties(to,from);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(from);
        System.out.println(to);

    }
}
