package com.zuzia.oop.threetwo;

public abstract class Animal {
    private String species;

    public Animal(String species) {
        this.setSpecies(species);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
