package ru.kpecmuk.forest.animals;

public final class Lion extends Animal {
    public Lion(String name, int strength) {
        super(name, strength);
    }

    @Override
    public final String getAnimalType() {
        return "Лев";
    }
}
