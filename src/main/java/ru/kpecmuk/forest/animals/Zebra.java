package ru.kpecmuk.forest.animals;

public final class Zebra extends Animal {
    public Zebra(String name, int strength) {
        super(name, strength);
    }

    @Override
    public final String getAnimalType() {
        return "Зебра";
    }
}
