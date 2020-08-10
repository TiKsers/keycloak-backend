package com.divae.keycloakbackend.config;

import com.divae.keycloakbackend.message.*;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import javax.annotation.security.RolesAllowed;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class WebSocketMessageHandlingController {
    @MessageMapping("/messages")
    @SendTo("/topic/messages")
    public OutputMessage send(Message message) {
        System.out.println("send was called." + message);
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new OutputMessage(message, time);
    }

    @RolesAllowed("user")
    @MessageMapping("/user")
    @SendTo("/topic/user")
    public HelloUser send(HelloUser message) {
        System.out.println("send was called." + message);
        return new HelloUser(message.getText());
    }

    @RolesAllowed("admin")
    @MessageMapping("/admin")
    @SendTo("/topic/admin")
    public HelloAdmin send(HelloAdmin message) {
        System.out.println("send was called." + message);
        return new HelloAdmin(message.getText());
    }

    @RolesAllowed({"admin", "user"})
    @MessageMapping("/all-user")
    @SendTo("/topic/all-user")
    public HelloAllUser send(HelloAllUser message) {
        System.out.println("send was called." + message);
        return new HelloAllUser(message.getText());
    }
}
