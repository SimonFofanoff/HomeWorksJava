public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;
    private Person host;

    public Cat(String name, int appetite, Person host){
        this.name = name;
        this.appetite = appetite;
        this.host = host;
        isFull = false;
    }

    public void eat(Plate plate){
        if (!plate.bigAppetite(appetite) && !isFull){
            System.out.println( name + " кушает");
            plate.decreaseFood(appetite);
            isFull = true;
        } else if (plate.bigAppetite(appetite)){
            System.out.println(name + " недоволен! мало еды!");
        } else if (isFull){
            System.out.println(name + " наелся!");
        }
    }
}
/*1. Расширить задачу про котов и тарелки с едой.
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
7. decreaseFood должен иметь возвращаемый тип void*/