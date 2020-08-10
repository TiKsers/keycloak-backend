package com.divae.keycloakbackend.message;

public class HelloAdmin {
    private String text;

    public HelloAdmin(String text) {
        this.text = text;
    }

    public HelloAdmin() {
        this("Hello Admin");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
