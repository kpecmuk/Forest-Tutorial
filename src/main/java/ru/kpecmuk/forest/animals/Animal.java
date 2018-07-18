package ru.kpecmuk.forest.animals;

/**
 * Абстрактный класс. Это означает то что нельзя сделать его экземпляр.
 * Короче нельзя создать просто животное. Тут скорее сосредоточены основные
 * признаки, которые есть у всех животных: рост, вес, возможно имя.
 */
public abstract class Animal implements I_Animal {
    private final String name;
    private final int strength;

    Animal(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        return strength == animal.strength && (name != null ? name.equals(animal.name) : animal.name == null);
    }

    @Override
    public final String getName() {
        return this.name;
    }

    @Override
    public final int getStrength() {
        return this.strength;
    }

    @Override
    public final String toString() {
        return getType() + " по имени " + getName() + " живёт в лесу";
    }

    /**
     * Сразу на входе считаем что проиграл объект enemy.
     * Если какая-то проверка сработала, просто меняем результат
     * на объект this
     *
     * @param enemy на входе принимает объект Animal
     * @return проигравший
     */
    public final Animal fightVS(Animal enemy) {
        Animal result = enemy;

        if (this.getStrength() < enemy.getStrength()) {
            result = this;
        }
        return result;
    }
}
