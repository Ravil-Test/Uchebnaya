package ru.nurullin.spring;

import java.util.ArrayList;
import java.util.List;

public class Hydra {
    String name;
    private List<Heads> heads = new ArrayList<>();

    public void setHeads(List<Heads> heads) {
        this.heads = heads;
    }


    public void spisok() {
        for (Heads heads : heads) {
            System.out.println(heads.getEyes() + " " + heads.getEars());
        }
    }
}
