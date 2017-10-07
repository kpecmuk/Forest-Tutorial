package ru.kpecmuk.forest.animals;

public class Zebra extends Animal {
    public Zebra(String name, int strength) {
        setName(name);
        setStrength(strength);
    }

    @Override
    public String toString() {
        return ("Зебра " + getName() + " живёт в лесу");
    }
}
