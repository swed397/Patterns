package org.patterns.behavioral.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {

    private User admin;
    private final List<User> userList = new ArrayList<>();

    @Override
    public void sendMessage(String message, User user) {
        for (User u : userList) {
            if (u != user) {
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }
}
