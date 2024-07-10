package ru.nurullin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Probapera {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Hunter hunter0 = context.getBean("hunter", Hunter.class);

        hunter0.killAnimal();

        context.close();
    }
}
