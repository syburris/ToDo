package com.company;

/**
 * Created by stevenburris on 10/13/16.
 */
public class User {
    int id;
    String name;
    String password;

    public User(int id, String username, String password) {
        this.id = id;
        this.name = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return name;
    }

    public void setUsername(String username) {
        this.name = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
