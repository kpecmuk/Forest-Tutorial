package ru.kpecmuk.forest.animals;

public class Tiger extends Animal {
    public Tiger(String name, int strength) {
        setName(name);
        setStrength(strength);
    }

    @Override
    public String toString() {
        return ("Тигр " + getName() + " живёт в лесу");
    }
}
