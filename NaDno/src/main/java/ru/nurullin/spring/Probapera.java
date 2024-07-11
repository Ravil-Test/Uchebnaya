package ru.nurullin.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Probapera {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Holodilnik holodilnik = context.getBean("holodilnik", Holodilnik.class);

        holodilnik.spisok();

        context.close();
    }
}
