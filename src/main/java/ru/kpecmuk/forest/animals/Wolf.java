package ru.kpecmuk.forest.animals;

public final class Wolf extends Animal {
    public Wolf(String name, int strength) {
        super(name, strength);
    }

    @Override
    public final String getAnimalType() {
        return "Волк";
    }
}
