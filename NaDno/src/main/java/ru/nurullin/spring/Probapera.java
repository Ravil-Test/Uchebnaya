package ru.nurullin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Probapera {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Hunter hunter0 = context.getBean("hunter1", Hunter.class);
        Hunter hunter1 = context.getBean("hunter0", Hunter.class);
        Hunter hunter2 = context.getBean("hunter2", Hunter.class);

        hunter0.killAnimal();
        hunter1.killAnimal();
        hunter2.killAnimal();

        context.close();
    }
}
