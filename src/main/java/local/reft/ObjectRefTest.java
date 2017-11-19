package local.reft;

/**
 * Created by codedrinker on 19/11/2017.
 */
public class ObjectRefTest {
    public static void main(String[] args) {
        Node oldNode = new Node("wcl");
        System.out.println(oldNode);
        Node copy = oldNode;
        System.out.println(copy);
        oldNode = new Node("xyn");
        System.out.println(copy);
        System.out.println(oldNode);
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
