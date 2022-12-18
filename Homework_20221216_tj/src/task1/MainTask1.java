package task1;

import java.util.HashMap;
import java.util.Map;

public class MainTask1 {
    /*
    3.Есть массив положительных целых чисел.  найти элемент (если он есть), который
    встречается в массиве >length/2 (доминантный элемент). В противном случае вернуть -1
     */
    public static void main(String[] args) {
        int[] arr = { 8, 15, 25, 1, 6, 2, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        System.out.println(findTheDominantElement(arr, 6));
    }

    public static int findTheDominantElement(int[] arr, int elem) {
        Map<Integer, Integer> arrMap = new HashMap<>();
        for (int a: arr) {
            if (arrMap.containsKey(a)) {
                arrMap.put(a, arrMap.get(a) + 1);
            } else {
                arrMap.put(a,1);
            }
        }

        for(int a: arr)
            if (arrMap.get(a) > (arr.length/2)) {
                return arrMap.get(a);
            }
        return -1;
    }
}