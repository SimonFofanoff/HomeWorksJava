public class Animal {
    String name;
    int maxDistanceRun;
    int maxDistanceSwim;


    public Animal(String name, int maxDistanceRun, int maxDistanceSwim){
        this.name = name;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwim = maxDistanceSwim;
    }
    public Animal(String name) {
        this.name = name;
        maxDistanceRun = 200;
        maxDistanceSwim = 0;
    }
    public void swimming(int distance){
        if (distance > maxDistanceSwim){
            System.out.println("Дистанция: " + distance + "м не преодалена! Максимальная дистанция: " + maxDistanceSwim);
        } else {
            System.out.println("Дистанция " + distance + "м преодалена");
        }
    }
    public void running(int distance){
        if (distance > maxDistanceRun){
            System.out.println("Дистанция: " + distance + "м не преодалена! Максимальная дистанция: " + maxDistanceRun);
        } else {
            System.out.println("Дистанция " + distance + "м преодалена");
        }
    }
}
/*1. Создать классы Собака и Кот с наследованием от класса Животное.

2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль.
 (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');

3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).

4. В коде должно отсутствовать дублирование (при дублировании можно заметить кусочки кода с одинаковой логикой, разница лишь в значениях).

5. * Добавить подсчет созданных котов, собак и животных.*/