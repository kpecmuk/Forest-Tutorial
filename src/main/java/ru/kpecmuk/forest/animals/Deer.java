package ru.kpecmuk.forest.animals;

public final class Deer extends Animal {
    public Deer(String name, int strength) {
        super(name, strength);
    }

    @Override
    public final String getType() {
        return "Олень";
    }
}
