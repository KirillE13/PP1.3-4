package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("John", "Lennon", (byte) 40);
        userService.saveUser("Paul", "McCartney", (byte) 81);
        userService.saveUser("Ringo", "Starr", (byte) 83);
        userService.saveUser("George", "Harrison", (byte) 58);

        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

        Util.closeSessionFactory();
    }
}
