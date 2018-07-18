package ru.kpecmuk.forest;

import ru.kpecmuk.forest.animals.Animal;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Тут мы создаёт список List для хранения объектов типа IAnimal.
 * Это называется композиция. Связь объектов через интерфейсы.
 */
class Forest {
    private final List<Animal> forestAnimals = new ArrayList<>();
    private PrintStream ps;

    Forest() {
        Scanner sc = new Scanner(System.in, "utf-8");
        System.setProperty("console.encoding", "utf-8");
        String encoding = System.getProperty("console.encoding", "utf-8");

        this.ps = new PrintStream(System.out, Boolean.parseBoolean(encoding));
    }

    void addNewAnimal(Animal animal) {
        this.forestAnimals.add(animal);
    }

    /**
     * Удаление животного из списка forestAnimals
     *
     * @param name животного в качестве параметра
     */
    void removeAnimal(String name) {
        boolean result = false;
        ps.println("Убираем животное с именем " + name);
        for (Animal animal : forestAnimals) {
            if (animal.getName().equals(name)) {
                result = true;
                removeAnimal(animal);
                break;
            }
        }
        if (!result) {
            ps.println(name + " не найден");
        }
    }

    private void removeAnimal(Animal animal) {
        ps.println(animal.getType() + " по имени " + animal.getName() + " больше не живёт в лесу");
        this.forestAnimals.remove(animal);
    }

    /**
     * Битва между животными.
     * Для начала определяем участников.
     * Потом выполняем инструкцию removeAnimal(animalA.fightVS(animalB)),
     * которая удалит проигравшего из леса навсегда.
     * Тоесть используется результат боя между animalA.fightVS(animalB),
     * где возвращается объект (проигравший) для удаления.
     *
     * @param firstFighter  Первый участник
     * @param secondFighter Второй участник
     */
    void fight(String firstFighter, String secondFighter) {
        Animal animalA = null;
        Animal animalB = null;

        for (Animal animal : forestAnimals) {
            if (animal.getName().equals(firstFighter)) {  // Определили первого участника поединка
                animalA = animal;
            }
            if (animal.getName().equals(secondFighter)) {  // Определили второго участника поединка
                animalB = animal;
            }
        }
        try {
            assert animalA != null; // здесь проверяем чтобы все участники были определены
            assert animalB != null; // чтобы не получить NullPointerException
            if (animalA.equals(animalB)) throw new UnsupportedOperationException();
            ps.println(animalA.getName() + " VS " + animalB.getName());
            removeAnimal(animalA.fightVS(animalB));
        } catch (NullPointerException e) {
            ps.println("Битва не состоялась");
        } catch (UnsupportedOperationException e) {
            ps.println("Нельзя биться с самим собой");
        }
    }

    /**
     * Выводим на экран список животных из списка forestAnimals
     */
    void tellMeWhoLiveHere() {
        ps.println("В лесу живут:");
        forestAnimals.forEach(ps::println);
    }
}
