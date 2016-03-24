package local.inheritation;

import org.apache.commons.beanutils.BeanUtils;
import utils.JsonUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by codedrinker on 3/21/16.
 */
public class Main {
    public static void main(String[] args) {

        SubClass subClass = new SubClass();
        System.out.println(subClass);
        String jacksonStringByObject = JsonUtils.getJacksonStringByObject(subClass);
        System.out.println(jacksonStringByObject);
        SuperClass s = new SuperClass();
        try {
            BeanUtils.copyProperties(s,subClass);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(JsonUtils.getJacksonStringByObject(s));
    }
}
