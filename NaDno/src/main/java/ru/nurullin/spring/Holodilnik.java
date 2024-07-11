package ru.nurullin.spring;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

public class Holodilnik {

    private List<Molochka> molochka1 = new ArrayList<>();

    private List<Rastitelnoe> rastitelnoe1= new ArrayList<>();

    @Autowired
    public void setMolochka1(List<Molochka> molochka1) {
        this.molochka1 = molochka1;
    }

    @Autowired
    public void setRastitelnoe1(List<Rastitelnoe> rastitelnoe1) {
        this.rastitelnoe1 = rastitelnoe1;
    }

    public void spisok() {
        for (Molochka molochka : molochka1) {
            System.out.println(molochka.getZhirnost());
        }
        for (Rastitelnoe rastitelnoe : rastitelnoe1) {
            System.out.println(rastitelnoe.getProishozhdenie());
        }

    }
}
