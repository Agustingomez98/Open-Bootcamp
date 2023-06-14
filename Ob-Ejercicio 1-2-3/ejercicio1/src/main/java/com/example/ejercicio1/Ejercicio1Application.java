package com.example.ejercicio1;

import com.example.ejercicios2.Saludo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejercicio1Application {

    public static void main (String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Saludo saludo = (Saludo) context.getBean("saludo");

        String texto = saludo.imprimirSaludo();
        System.out.println(texto);

    }
}
