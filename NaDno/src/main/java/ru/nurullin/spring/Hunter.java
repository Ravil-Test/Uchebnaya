package ru.nurullin.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hunter {
    private Animal currentAnimal1;
    private Animal currentAnimal2;
    private Animal currentAnimal3;

    @Autowired
    public Hunter(@Qualifier("frog") Animal currentAnimal1, @Qualifier("goat") Animal currentAnimal2, @Qualifier("goose") Animal currentAnimal3) {
        this.currentAnimal1 = currentAnimal1;
        this.currentAnimal2 = currentAnimal2;
        this.currentAnimal3 = currentAnimal3;
    }

    public void killAnimal() {
        System.out.println("Охотник стреляет в " + currentAnimal1.sayBeforDeath());
        System.out.println("Охотник стреляет в " + currentAnimal2.sayBeforDeath());
        System.out.println("Охотник стреляет в " + currentAnimal3.sayBeforDeath());
    };
}
