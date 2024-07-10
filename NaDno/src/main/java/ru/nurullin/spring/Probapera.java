package ru.nurullin.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Probapera {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Spisok spisok = context.getBean("spisok", Spisok.class);

        System.out.println(spisok);

        context.close();
    }
}
