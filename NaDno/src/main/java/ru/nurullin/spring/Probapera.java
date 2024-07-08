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

        Hunter hunter0 = new Hunter(animal0);
        Hunter hunter1 = new Hunter(animal1);
        Hunter hunter2 = new Hunter(animal2);

        hunter0.killAnimal();
        hunter1.killAnimal();
        hunter2.killAnimal();

        context.close();
    }
}
