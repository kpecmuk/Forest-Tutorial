package ru.kpecmuk.forest.animals;

public class Zebra extends Animal {
    public Zebra(String name, int strength) {
        super(name, strength);
    }

    @Override
    public String getType() {
        return "Зебра";
    }
}
