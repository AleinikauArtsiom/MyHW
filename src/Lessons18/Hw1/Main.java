package Lessons18.Hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       /* При помощи стримов из списка, содержащего объекты Developer, вывести только те, id
> 10 и name начинается с ‘An’.*/
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User(14,"Anton"));
        userList.add(new User(7,"Anzela"));
        userList.add(new User(25,"Petia"));
        userList.add(new User(2,"Artsiom"));
        userList.add(new User(19,"Anna"));
        userList.add(new User(1,"Svetlana"));
        userList.add(new User(4,"Vera"));
            userList.stream()
                    .filter(i -> i.getName().startsWith("An"))
                    .filter(g -> g.getId()>10)
                    .forEach(user -> System.out.println("ID: " + user.getId() + "; name: " + user.getName()));

//                        for(User e : filtered){
//                            System.out.println("ID: " + e.getId() + "; Name: " + e.getName());
//                        }

    }
}