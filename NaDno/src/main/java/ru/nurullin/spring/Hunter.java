package ru.nurullin.spring;

public class Hunter {
    private Animal currentAnimal;

    public Hunter(Animal currentAnimal) {
        this.currentAnimal = currentAnimal;
    }

    public void killAnimal() {
        System.out.println("Охотник стреляет в " + currentAnimal.sayBeforDeath());
    };
}
