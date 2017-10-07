package ru.kpecmuk.forest;

import ru.kpecmuk.forest.animals.IAnimal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kpecmuk
 * @since 01.10.2017
 */
class Forest {
    private List<IAnimal> forestAnimals = new ArrayList<>();

    void addNewAnimal(IAnimal animal) {
        this.forestAnimals.add(animal);
    }

    /**
     * Удаление животного из списка forestAnimals
     *
     * @param name Имя животного в качестве параметра
     */
    void removeAnimal(String name) {
        System.out.println("Ущем и убираем животное с именем: " + name);
        for (IAnimal forestAnimal : forestAnimals) {
            if (forestAnimal.getName().equals(name)) {
                System.out.println(forestAnimal.getName() + " больше не живёт в лесу");
                this.forestAnimals.remove(forestAnimal);
                break;
            }
        }
    }

    private void removeAnimal(IAnimal animal) {
        for (IAnimal forestAnimal : forestAnimals) {
            if (forestAnimal.equals(animal)) {
                removeAnimal(animal.getName());
                break;
            }
        }
    }

    /**
     * Битва между животными
     *
     * @param fighterA Имя первого участника
     * @param fighterB Имя второго участника
     */
    void fight(String fighterA, String fighterB) {
        IAnimal animalA = null;
        IAnimal animalB = null;

        for (IAnimal forestAnimal : forestAnimals) {
            if (forestAnimal.getName().equals(fighterA)) {  // Определили первого участника поединка
                animalA = forestAnimal;
            }
            if (forestAnimal.getName().equals(fighterB)) {  // Определили второго участника поединка
                animalB = forestAnimal;
            }
        }
        try {
            assert animalA != null;
            assert animalB != null;
            System.out.println(animalA.getName() + " vs " + animalB.getName());
            removeAnimal(animalA.fightVS(animalB));
        } catch (NullPointerException e) {
            System.out.println("Битва не состоялась");
        }
    }

    /**
     * Выводим на экран список животных из списка forestAnimals
     */
    void tellMeWhoLiveHere() {
        System.out.println("Animal list:");
        for (IAnimal forestAnimal : forestAnimals) {
            System.out.println(forestAnimal);
        }
    }
}
