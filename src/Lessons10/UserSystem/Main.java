package Lessons10.UserSystem;

/* Задача 1:
       Создать класс для описания пользователя системы. Переопределить в классе методы
       toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
       значением полей и сравнить с помощью метода equals.
        */
public class Main {
    public static void main(String[] args) {
        User user1 = new User("bob", "qwert258@mail.ru");
        User user2 = new User("john", "fyjd@mail.ru");
        User user3 = new User("bob", "qwert258@mail.ru");
        System.out.println("User1 " + user1.toString());
        System.out.println("User2 " + user2.toString());
        System.out.println("User3 " + user3.toString());

        System.out.println("----------------------------------------------------");

        System.out.println("user1 == user3 its -  " + user1.equals(user3));
        System.out.println("user2 == user3 its -  " + user2.equals(user3));

    }
}
