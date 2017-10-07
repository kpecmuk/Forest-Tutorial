package ru.kpecmuk.forest.animals;

public abstract class Animal implements IAnimal {
    private String name;
    private int strength;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public IAnimal fightVS(IAnimal enemy) {
        IAnimal result = enemy;

        if (this.getStrength() < enemy.getStrength()) {
            result = this;
        }

        return result;
    }

    @Override
    public String toString() {
        return ("В лесу живёт животное");
    }
}
