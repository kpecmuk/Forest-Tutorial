package ru.kpecmuk.forest.animals;

public class Lion extends Animal {
    public Lion(String name, int strength) {
        setName(name);
        setStrength(strength);
    }

    @Override
    public String toString() {
        return ("Лев " + getName() + " живёт в лесу");
    }
}
