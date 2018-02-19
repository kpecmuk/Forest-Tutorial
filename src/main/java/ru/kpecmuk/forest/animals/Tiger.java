package ru.kpecmuk.forest.animals;

public final class Tiger extends Animal {
    public Tiger(String name, int strength) {
        super(name, strength);
    }

    @Override
    public String getType() {
        return "Тигр";
    }
}
