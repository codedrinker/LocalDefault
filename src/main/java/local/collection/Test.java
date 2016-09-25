package local.collection;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        char[] chars = num.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                System.out.println("This is not a palindrome number!");
                return;
            }
        }

        System.out.println("This is a palindrome number!");
    }
}
