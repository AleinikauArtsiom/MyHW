package Lessons15.Pzz33;

import java.util.Collections;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private List<Double> grades;
    private int cours;

    public Student(String name, String group, int cours, List<Double> grades) {
        this.name = name;
        this.group = group;
        this.grades = grades;
        this.cours = cours;
    }

        //геттеры
            public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public int getCours() {
        return cours;
    }


    public double  calculator (){
        double sum = 0;
        for(Double grade : grades){
            sum += grade;

        }

        return  sum / grades.size();

    }
    public void coursePlus(){
        this.cours++;
    }
}
