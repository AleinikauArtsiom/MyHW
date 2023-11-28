package Lessons15.Pz3;

import java.util.List;

public class Student {
    private String name;
    private int cours;
    private String group;
    private List<Double> grades;

    public Student(String name,int cours,String group,List<Double> grades) {
        this.grades = grades;
        this.name = name;
        this.cours = cours;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getCours() {
        return cours;
    }

    public String getGroup() {
        return group;
    }

    public List<Double> getGrades() {
        return grades;
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
