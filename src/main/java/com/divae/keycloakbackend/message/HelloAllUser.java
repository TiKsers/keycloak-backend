package com.divae.keycloakbackend.message;

public class HelloAllUser {
    private String text;

    public HelloAllUser(String text) {
        this.text = text;
    }

    public HelloAllUser() {
        this("Hello Admin User");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
