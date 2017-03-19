package exam.convert;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int index = 0;
        while (scanner.hasNextInt()) {
            count = scanner.nextInt();
        }
        while (scanner.hasNext()) {

            String next = scanner.next();
            index++;
            if (index > count) {
                break;
            }
            System.out.println(convert(next));
        }
    }

    public static String convert(String string) {
        StringBuffer sb = new StringBuffer(string);

        if (string != null && (string.contains("-") || string.contains("+"))) {
            return string.replace("-", "_").replace("+", "/\\");
        } else {
            return string.replace("_", "-").replace("/\\", "+");
        }
    }
}
