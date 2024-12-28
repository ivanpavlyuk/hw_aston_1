package ru.ivanpavlyuk.hw4;

import java.util.Arrays;

public class BubbleSort {
    public static <T extends Comparable<T>> void bubbleSort(ArrList<T> list) {
        boolean swap;
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            swap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    T temp = list.get(j);
                    list.replace(j, list.get(j + 1));
                    list.replace(j + 1, temp);
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        ArrList<Integer> array = new ArrList<>();
        array.add(6).add(1).add(3).add(2).add(10).add(1);
        System.out.println(array);
        bubbleSort(array);
        System.out.println(array);

        ArrList<String> arr = new ArrList<>();
        arr.add("G").add("f").add("2").add("A").add("z").add("1");
        System.out.println(arr);
        bubbleSort(arr);
        System.out.println(arr);
    }
}
