package ru.kpecmuk.forest.animals;

public class Wolf extends Animal {
    public Wolf(String name, int strength) {
        setName(name);
        setStrength(strength);
    }

    @Override
    public String toString() {
        return ("Волк " + getName() + " живёт в лесу");
    }
}
