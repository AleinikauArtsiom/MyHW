package Lessons15.Pz3;

import java.util.Iterator;
import java.util.List;

public class Main2 {
    public static void removeStudentsAndPromote(List<Student> students) {
        Iterator<Student> iterator = students.iterator() ;
        while(iterator.hasNext()){
            Student student = iterator.next();
            double averageGrade = student.calculator();
            if(averageGrade<3){
                iterator.remove();
            } else {
                student.coursePlus();
            }

        }
    }
    public static void printStudents (List<Student> students, int cours){
        System.out.println("Students study a " + cours);
        for(Student student : students){
         if(student.getCours() == cours){
             System.out.println(student.getName());
         }
        }
    }
}
