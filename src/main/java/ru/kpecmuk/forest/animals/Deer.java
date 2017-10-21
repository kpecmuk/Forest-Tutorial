package ru.kpecmuk.forest.animals;

public class Deer extends Animal {
    public Deer(String name, int strength) {
        super(name, strength);
    }

    @Override
    public String getType() {
        return "Олень";
    }
}
