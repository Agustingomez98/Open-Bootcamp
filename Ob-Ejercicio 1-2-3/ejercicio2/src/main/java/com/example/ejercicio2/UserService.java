package com.example.ejercicio2;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    public com.example.ejercicio2.NotificationService notificationService;

    public UserService (com.example.ejercicio2.NotificationService notificationService){
        this.notificationService = notificationService;
    }
}
