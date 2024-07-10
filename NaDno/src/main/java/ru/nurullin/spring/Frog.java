package ru.nurullin.spring;

import org.springframework.stereotype.Component;

@Component
public class Frog extends Animal {
    @Override
    public String sayBeforDeath() {
        return "Лягушку...Квак";
    }
}
