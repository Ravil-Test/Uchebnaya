package ru.nurullin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Probapera {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Holodilnik holodilnik = context.getBean("holodilnik", Holodilnik.class);

        holodilnik.spisok();

        context.close();
    }
}
