package local.collectiont;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;

/**
 * Created by codedrinker on 3/8/16.
 */
public class MapTest {
    public static void main(String[] args) {
        List<User> users = Lists.newArrayList(new User("name", 2), new User("Nick", 2), new User("he", 3));
        System.out.println(users);

        ImmutableMap<Integer, User> integerUserImmutableMap = Maps.uniqueIndex(users, new Function<User, Integer>() {
            @Override
            public Integer apply(User input) {
                return input.getPriority();
            }
        });

        System.out.println(integerUserImmutableMap);
    }

    /**
     * Created by clwang on 2/1/16.
     */
    public static class User{
        private String name ;
        private int priority;

        public User(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        @Override
        public String toString() {
            return "local.collection.User{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
        }
    }
}
