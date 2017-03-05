package com.codeclan.example.zoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Zoo {

    private String name;
    private ArrayList<Enclosure> enclosures;

    public Zoo(String name) {
        this.name = name;
        this.enclosures = new ArrayList<Enclosure>();
    }

    public void addEnclosure(Enclosure enclosure) {
        this.enclosures.add(enclosure);
    }

    public int getNumberOfEnclosures() {
       return enclosures.size();
    }
}
