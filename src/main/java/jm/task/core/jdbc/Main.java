package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        User user1 = new User("Александр", "Багин", (byte) 24);
        User user2 = new User("Иван", "Иванов", (byte) 20);
        User user3 = new User("Петр", "Петров", (byte) 31);
        User user4 = new User("Алексей", "Федоров", (byte) 25);
        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        System.out.println("User с именем - " + user1.getName() + " добавлен в базу данных");
        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        System.out.println("User с именем - " + user2.getName() + " добавлен в базу данных");
        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        System.out.println("User с именем - " + user3.getName() + " добавлен в базу данных");
        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        System.out.println("User с именем - " + user4.getName() + " добавлен в базу данных");
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
