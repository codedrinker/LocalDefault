package local.reft;

import java.util.Arrays;

/**
 * Created by codedrinker on 19/11/2017.
 */
public class ArrayRefTest {
    public static void main(String[] args) {
        Node[] oldNodes = {new Node("wcl"), new Node("xyn")};
        System.out.println(Arrays.toString(oldNodes));
        Node[] copy = oldNodes;
        oldNodes = new Node[]{new Node("lmh")};
        System.out.println(Arrays.toString(oldNodes));
        System.out.println(Arrays.toString(copy));

    }

    static class Node {
        private String name;

        public Node(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
