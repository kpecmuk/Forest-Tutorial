package ru.kpecmuk.forest.animals;

/**
 * Абстрактный класс. Это означает то что нельзя сделать его экземпляр.
 * Короче нельзя создать просто животное. Тут скорее сосредоточены основные
 * признаки, которые есть у всех животных: рост, вес, возможно имя.
 */
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

    /**
     * Сразу на входе считаем что проиграл объект enemy.
     * Если какая-то проверка сработала, просто меняем результат
     * на объект this
     *
     * @param enemy на входе принимает объект IAnimal
     * @return проигравший
     */
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
