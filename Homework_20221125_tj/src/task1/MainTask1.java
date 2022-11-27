package task1;

import java.util.Arrays;
import java.util.List;

public class MainTask1 {
    /*
    5*.Написать метод, который возвращает строку, встречающуюся раньше в листе: самую
    короткую или самую длинную. Если несколько строчек самые короткие или самые длинные,
    тогда вернуть первую встреченную  из них. Лист не пустой
    "bb","a","ff","ddd" -> "a"
    "bb","aaa","ff","d" -> "aaa"
     */
    public static void main(String[] args) {
        List<String> arrString1 = Arrays.asList("bb", "a", "ff", "ddd");
        System.out.println(getStrMinOrMax(arrString1));

        List<String> arrString2 = Arrays.asList("bb", "aaa","mmmmmmm", "ff", "d");
        System.out.println(getStrMinOrMax(arrString2));

    }

    public static String getStrMinOrMax(List<String> arr) {
        String result = arr.get(0);
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (result.length() > arr.get(i).length()) {
                indexMin = i;
                result = arr.get(i);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (result.length() < arr.get(i).length()){
                indexMax = i;
                result = arr.get(i);
            }
        }
        if (indexMin < indexMax) {
            result = arr.get(indexMin);
        } else {
            result = arr.get(indexMax);
        }
        return result;
    }
}
