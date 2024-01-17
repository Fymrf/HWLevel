package one.hw3;

import java.util.ArrayList;

public class Box<T extends Fruits> {
    private ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.size() == 0) {
            return 0;
        }
        float weight = 0;
        for (T fruit : fruits) {
            if (fruit instanceof Apples) {
                weight += 1.0f;
            } else if (fruit instanceof Oranges) {
                weight += 1.5f;
            }
        }
        return weight;
    }

    public boolean compare(Box<?> anotherBox) {
        return this.getWeight() == anotherBox.getWeight();
    }

    public void moveTo(Box<T> anotherBox) {
        if (this == anotherBox) {
            return;
        }
        if (!fruits.isEmpty() && fruits.get(0).getClass() == anotherBox.fruits.get(0).getClass()) {
            anotherBox.fruits.addAll(fruits);
            fruits.clear();
        } else {
            throw new IllegalArgumentException("Нельзя перемещать фрукты между коробками разных типов");
        }
    }
}