package ru.nurullin.spring;

import org.springframework.stereotype.Component;

@Component
public class Goose extends Animal {
    @Override
    public String sayBeforDeath() {
        return "Гуся...Кряк";
    }
}
