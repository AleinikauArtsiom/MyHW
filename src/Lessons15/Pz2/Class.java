package Lessons15.Pz2;

import java.util.LinkedList;

public class Class {
    LinkedList <String> animalsName;

    {
        animalsName = new LinkedList<>();
    }

    public void addAnimals (String animal){
        animalsName.addLast(animal);


    }
    public String  deleteAnimals(){
      //  animalsName.removeFirst();
        if(animalsName.isEmpty()){
            return "pysto";
        } else {
            String removedAnimal =  animalsName.removeFirst();
            System.out.println("remove word: " + removedAnimal);
            return null;
        }
    }
    public void ssout (){
        System.out.println(animalsName);
    }

}
