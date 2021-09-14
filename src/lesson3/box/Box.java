package lesson3.box;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruits> {
   //Для хранения фруктов внутри коробки можно использовать ArrayList;
    private final ArrayList<T> list = new ArrayList<>();

    public Box(T... list) {
        this.list.addAll(Arrays.asList(list));
    }

    public ArrayList<T> getList() {
        return list;
    }

    public void addFruit (T fruits) {
        list.add(fruits);
    }

// Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    public float getWeight() {
        return list.size()*list.get(0).getWeight();
    }
//  Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
    public boolean compare (Box box) {
        return  this.getWeight() == box.getWeight();
    }
    public void poorFruit (Box<? super T> box) {
        box.list.addAll(this.list);
        list.clear();
    }

}
