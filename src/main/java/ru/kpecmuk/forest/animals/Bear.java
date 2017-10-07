package ru.kpecmuk.forest.animals;

public class Bear extends Animal {
    public Bear(String name, int strength) {
        setName(name);
        setStrength(strength);
    }

    @Override
    public String toString() {
        return ("Медведь " + getName() + " живёт в лесу");
    }
}
