package ru.kpecmuk.forest;

import ru.kpecmuk.forest.animals.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Тут мы создаёт список List для хранения объектов типа IAnimal.
 * Это называется композиция. Связь объектов через интерфейсы.
 */
class Forest {
    private final List<Animal> forestAnimals = new ArrayList<>();

    void addNewAnimal(Animal animal) {
        this.forestAnimals.add(animal);
    }

    /**
     * Удаление животного из списка forestAnimals
     *
     * @param name Имя животного в качестве параметра
     */
    void removeAnimal(String name) {
        boolean result = false;
        System.out.println("Ищем и убираем животное с именем " + name);
        for (Animal animal : forestAnimals) {
            if (animal.getName().equals(name)) {
                result = true;
                removeAnimal(animal);
                break;
            }
        }
        if (!result) {
            System.out.println(name + " не найден");
        }
    }

    private void removeAnimal(Animal animal) {
        System.out.println(animal.getType() + " по имени " + animal.getName() + " больше не живёт в лесу");
        this.forestAnimals.remove(animal);
    }

    /**
     * Битва между животными.
     * Для начала определяем участников. И потом выполняем инструкцию
     * removeAnimal(animalA.fightVS(animalB)), которая удалит проигравшего
     * из леса навсегда. Тоесть используется результат боя между
     * animalA.fightVS(animalB), где возвращается объект (проигравший)
     * для удаления.
     *
     * @param fighterA Имя первого участника
     * @param fighterB Имя второго участника
     */
    void fight(String fighterA, String fighterB) {
        Animal animalA = null;
        Animal animalB = null;

        for (Animal forestAnimal : forestAnimals) {
            if (forestAnimal.getName().equals(fighterA)) {  // Определили первого участника поединка
                animalA = forestAnimal;
            }
            if (forestAnimal.getName().equals(fighterB)) {  // Определили второго участника поединка
                animalB = forestAnimal;
            }
        }
        try {
            assert animalA != null; // здесь проверяем чтобы все участники были определены
            assert animalB != null; // чтобы не получить NullPointerException
            if (animalA.equals(animalB)) throw new UnsupportedOperationException();
            System.out.println(animalA.getName() + " VS " + animalB.getName());
            removeAnimal(animalA.fightVS(animalB));
        } catch (NullPointerException e) {
            System.out.println("Битва не состоялась");
        } catch (UnsupportedOperationException e) {
            System.out.println("Нельзя биться с самим собой");
        }
    }

    /**
     * Выводим на экран список животных из списка forestAnimals
     */
    void tellMeWhoLiveHere() {
        System.out.println("В ЛЕСУ ЖИВУТ:");
        for (Animal forestAnimal : forestAnimals) {
            System.out.println(forestAnimal);
        }
    }
}
