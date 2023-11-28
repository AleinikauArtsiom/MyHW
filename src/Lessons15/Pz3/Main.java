package Lessons15.Pz3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static Lessons15.Pz3.Main2.printStudents;
import static Lessons15.Pz3.Main2.removeStudentsAndPromote;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("ivan", 1, "group 10705121", Arrays.asList(4.0,2.4,1.0,3.9,1.0,1.0));
        Student student2 = new Student("kola", 2, "group 10835623", Arrays.asList(2.0,1.4,1.0,3.1,1.0,0.9));
        Student student3 = new Student("ivan", 3, "group 10234571", Arrays.asList(4.0,4.4,2.0,3.9,5.0,5.0));
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);



        removeStudentsAndPromote(studentList);
        printStudents(studentList,1);
    }
}
