package ru.geekbrains;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Васька", 50),
                new Cat("Барсик", 10),
                new Cat("Зоська", 25),
                new Cat("Мурзик", 50),
                new Cat("Фуфурка", 10)};
        Plate plate = new Plate( 100);

        for (Cat cat : cats) {//не совсем понимаю зачем тут массив, если
            cat.eat(plate);   //код сам выдает кто может наесться, а кто нет
            cat.info();
//            plate.addFood(5); // тут можно же менять значение добавки еды
            plate.info();       // после каждой итерации котов, либо ниже

        }
        plate.addFood(50);
        plate.info();
    }
}
