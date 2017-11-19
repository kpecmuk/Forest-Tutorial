package ru.kpecmuk.forest;

import ru.kpecmuk.forest.animals.*;

public class Main {
    public static void main(String[] args) {
        /*
          Создаём лес
         */
        Forest forest = new Forest();

        /*
          Заселяем лес животными
         */
        forest.addNewAnimal(new Bear("Миша", 10));
        forest.addNewAnimal(new Lion("Симба", 9));
        forest.addNewAnimal(new Tiger("Тигра", 8));
        forest.addNewAnimal(new Wolf("Волк", 5));
        forest.addNewAnimal(new Zebra("Зёбра", 4));
        forest.addNewAnimal(new Deer("Бэмби", 3));

        /*
          Выводим список животных
         */
        forest.tellMeWhoLiveHere();

        /*
          Выселяем из леса пару хищников, чьи имена совпадают с переданными параметрами
         */
        forest.removeAnimal("Волк");
        forest.removeAnimal("Тигра");
        forest.tellMeWhoLiveHere();

        /*
          Устраиваем битву
         */
        forest.fight("Миша", "Бэмби");
        forest.tellMeWhoLiveHere();
    }
}
