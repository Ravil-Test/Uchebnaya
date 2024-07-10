package ru.nurullin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Probapera {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Animal animal0 = context.getBean("goose", Animal.class);
        Animal animal1 = context.getBean("goat", Animal.class);
        Animal animal2 = context.getBean("frog", Animal.class);
        Hunter hunter0 = context.getBean("hunter", Hunter.class);

        hunter0.killAnimal();

        context.close();
    }
}
