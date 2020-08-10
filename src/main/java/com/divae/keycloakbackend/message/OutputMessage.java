package com.divae.keycloakbackend.message;

import com.divae.keycloakbackend.message.Message;

public class OutputMessage {
    private String from;
    private String message;
    private String auth;
    private String time;

    public OutputMessage(String from, String message, String auth, String time) {
        this.from = from;
        this.message = message;
        this.auth = auth;
        this.time = time;
    }

    public OutputMessage(Message message, String time) {
        this(message.getFrom(), message.getText(), message.getAuth(), time);
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
