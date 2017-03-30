package local.arraylistt;

import java.util.Scanner;

/**
 * Created by codedrinker on 30/03/2017.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        int index = 0;
        while (index < size) {
            array[index] = scanner.nextInt();
            index++;
        }
        boolean up = true;//定义方向
        int previousSize = 0;
        int previousStart = 0;
        int previousEnd = 0;
        int currentSize = 0;
        int currentStart = 0;
        for (int i = 0; i < array.length; i++) {
            if (i + 1 < array.length) {
                if (up) {
                    if (array[i + 1] > array[i]) {
                        currentSize++;
                    } else {
                        up = false;
                        currentSize++;
                    }
                } else {
                    if (array[i + 1] < array[i]) {
                        currentSize++;
                    } else {
                        up = true;
                        if (currentSize > previousSize) {
                            previousSize = currentSize;
                            previousStart = currentStart;
                            previousEnd = i;
                        }
                        currentSize = 1;
                        currentStart = i + 1;
                    }
                }

            } else {
                if (previousEnd == previousStart) {
                    System.out.println("-1 -1");
                } else {
                    System.out.println(previousStart + " " + previousEnd);
                }
            }
        }
    }
}
