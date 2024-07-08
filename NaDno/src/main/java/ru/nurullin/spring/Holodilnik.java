package ru.nurullin.spring;

import java.util.ArrayList;
import java.util.List;

public class Holodilnik {
    private List<Molochka> molochka = new ArrayList<>();
    private List<Rastitelnoe> rastitelnoe = new ArrayList<>();


    public void setMolochka(List<Molochka> molochka) {
        this.molochka = molochka;
    }

    public void setRastitelnoe(List<Rastitelnoe> rastitelnoe) {
        this.rastitelnoe = rastitelnoe;
    }

    public void spisok() {
        for (Molochka molochka : molochka) {
            System.out.println(molochka.getZhirnost());
        }
        for (Rastitelnoe rastitelnoe : rastitelnoe) {
            System.out.println(rastitelnoe.getProishozhdenie());
        }

    }
}
