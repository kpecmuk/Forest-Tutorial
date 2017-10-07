package ru.kpecmuk.forest.animals;

public class Deer extends Animal {
    public Deer(String name, int strength) {
        setName(name);
        setStrength(strength);
    }

    @Override
    public String toString() {
        return ("Олень " + getName() + " живёт в лесу");
    }
}
