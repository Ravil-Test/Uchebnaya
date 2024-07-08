package ru.nurullin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Probapera {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Person person0 = context.getBean("person0", Person.class);

        System.out.println(person0);

        context.close();
    }
}
