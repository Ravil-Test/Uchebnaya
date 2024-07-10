package ru.nurullin.spring;

import org.springframework.stereotype.Component;

@Component
public class Goat extends Animal {
    @Override
    public String sayBeforDeath() {
        return "Козлика...Беееек";
    }
}
