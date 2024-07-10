package ru.nurullin.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Spisok {
    private String name;
    private int age;

    private Person person0;
    private Person person1;
    private Person person2;

    public Spisok(@Qualifier("spongeBob") Person person0, @Qualifier("patrik") Person person1, @Qualifier("squidward") Person person2) {
        this.person0 = person0;
        this.person1 = person1;
        this.person2 = person2;
    }

    public String toString() {
        return person0.getName() + " age "+  person0.getAge() + "\n" + person1.getName() + " age "+  person1.getAge() + "\n"+ person2.getName() + " age "+  person2.getAge();
    }
}
