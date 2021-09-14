package lesson3;
import lesson3.box.Apple;
import lesson3.box.Box;
import lesson3.box.Orange;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Box<Apple> box1 = new Box<>(apple1, apple2, apple3);
        Box<Orange> box2 = new Box<>(orange1, orange2);
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box1.compare(box2));
        Box<Orange> box3 = new Box<>(orange1, orange2);
        box2.poorFruit(box3);
        box1.addFruit(new Apple());
        box2.addFruit(new Orange());
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());

        // 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
        String[] fruits = {"Яблоки", "Апельсины", "Бананы"};
        System.out.println((Arrays.toString(fruits)));
        changeFruits(fruits);

    }
    public static void changeFruits(Object[] fruits) {
        Object oneVal = fruits[0];
        fruits[0] = fruits[1];
        fruits[1] = oneVal;
        System.out.println(Arrays.toString(fruits));
    }
}
