package one.hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeWork3 {

    public static void main(String[] args) {
        firstTask();

        Fruits fruits = new Fruits();
        fruits.workWithFruits();
        System.exit(-1);
    }

    public static void firstTask() {
        String[] arr = new String[]{"first", "second", "third", "fourth", "fifth"};
        int firstElemToChange = 0;
        int secondElemToChange = 4;

        changeElem(arr, firstElemToChange, secondElemToChange);
        List<String> list = convertArrayToList(arr);

        System.out.println(list);
    }

    public static <T> void changeElem(T[] arr, int i, int j) {
        T elem = arr[i];
        arr[i] = arr[j];
        arr[j] = elem;
    }

    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }
}