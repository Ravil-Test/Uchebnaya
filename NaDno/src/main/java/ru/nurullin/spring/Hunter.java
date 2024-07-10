package ru.nurullin.spring;

public class Hunter {
    private Hunter() {}

    public static Hunter getHunter() {
        return new Hunter();
    }

    private Animal currentAnimal;

    public void setCurrentAnimal(Animal currentAnimal) {
        this.currentAnimal = currentAnimal;
    }

    public Hunter(Animal currentAnimal) {
        this.currentAnimal = currentAnimal;
    }

    public void killAnimal() {
        System.out.println("Охотник стреляет в " + currentAnimal.sayBeforDeath());
    };
}
