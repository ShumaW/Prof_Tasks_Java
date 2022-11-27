package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTask2 {
    /*
    Есть лист  целых чисел. Написать метод, который вернет список без элементов, больше числа n.
    public List withoutElementsMoreThanN(List ints, int n)
     */
    public static void main(String[] args) {
        List<Integer> intArr = Arrays.asList(1, 5, 14, 99, 102, 100, 25, 78, 12, 3, 4, 6, 125, 259);
        System.out.println(withoutElementsMoreThanN(intArr, 126));

    }

    public static List<Integer> withoutElementsMoreThanN(List<Integer> arr, int n) {
        List<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) <= n) {
                newArr.add(arr.get(i));
            }
        }
        return newArr;
    }
}

