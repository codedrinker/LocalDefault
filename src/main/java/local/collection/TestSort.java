package local.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<List<Student>> students = new ArrayList<List<Student>>(101);
        for (int i = 0; i <= 100; i++) {
            students.add(new ArrayList<Student>());
        }
        for (int index = 0; index < count; index++) {
            Student student = new Student(scanner.next(), scanner.nextInt());
            students.get(student.getScore()).add(student);
        }
        for (int j = 100; j >= 0; j--) {
            for (Student s : students.get(j)) {
                System.out.println(s);
            }
        }
    }
}

class Student {
    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }

    @Override
    public String toString() {
        return this.name + " " + this.score;
    }
}


