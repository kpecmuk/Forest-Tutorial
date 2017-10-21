package ru.kpecmuk.forest.animals;

public class Lion extends Animal {
    public Lion(String name, int strength) {
        super(name, strength);
    }

    @Override
    public String getType() {
        return "Лев";
    }
}
