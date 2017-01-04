package local.beanutilst;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by codedrinker on 3/9/16.
 */
public class BeanUtilsCopyProperties {
    public static void main(String[] args) {
        CopyFromProperty from = new CopyFromProperty("name", 2);
        System.out.println(from);
        CopyToProperty to = new CopyToProperty();
        try {
            BeanUtils.copyProperties(to, from);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(from);
        System.out.println(to);

    }

    public static class CopyFromProperty {
        private int age;
        private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CopyFromProperty(String name, int i) {
            this.age = i;
            this.name = name;
        }

        @Override
        public String toString() {
            return "CopyFromProperty{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    /**
     * Created by codedrinker on 3/9/16.
     */
    public static class CopyToProperty {
        @Override
        public String toString() {
            return "CopyToProperty{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        private int age;
        private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
