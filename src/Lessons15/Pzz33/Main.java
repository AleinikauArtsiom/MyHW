package Lessons15.Pzz33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Artsiom", "A107", 3, Arrays.asList(2.3, 4.2, 4.8, 2.6, 5.0));
        Student student2 = new Student("Andzei", "A107", 2, Arrays.asList(5.0, 4.2, 4.8, 4.6, 5.0));
        Student student3 = new Student("MakeychikMonkey", "A105", 1, Arrays.asList(0.1, 0.2, 0.3, 0.4, 0.5));
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        double srOcenka = 1;
        if (srOcenka < 3) {
            studentList.remove(student2);
        } else {
            student1.coursePlus();
            student2.coursePlus();
            student3.coursePlus();
        }
    }
}