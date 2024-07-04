package ru.nurullin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Probapera {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Person person0 = context.getBean("person0", Person.class);
        Person person1 = context.getBean("person1", Person.class);
        Person person2 = context.getBean("person2", Person.class);

        System.out.println(person0);
        System.out.println(person1);
        System.out.println(person2);

        context.close();
    }
}
