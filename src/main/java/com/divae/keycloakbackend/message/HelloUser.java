package com.divae.keycloakbackend.message;

public class HelloUser {
    private String text;

    public HelloUser(String text) {
        this.text = text;
    }

    public HelloUser() {
        this("Hallo User");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
