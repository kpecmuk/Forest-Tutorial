package ru.kpecmuk.forest.animals;

public class Bear extends Animal {
    public Bear(String name, int strength) {
        super(name, strength);
    }

    @Override
    public String getType() {
        return "Медведь";
    }
}
