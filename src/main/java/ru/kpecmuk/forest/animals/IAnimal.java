package ru.kpecmuk.forest.animals;

public interface IAnimal {

    String getName();

    void setName(String name);

    int getStrength();

    void setStrength(int strength);

    String toString();

    IAnimal fightVS(IAnimal enemy);
}
