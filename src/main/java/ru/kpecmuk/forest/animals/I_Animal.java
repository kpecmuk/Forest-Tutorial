package ru.kpecmuk.forest.animals;

public interface I_Animal {
    String getName();

    String getType();

    int getStrength();

    String toString();

    Animal fightVS(Animal animal);
}
