package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTask2 {
    /*
    4* Написать метод, который принимает список имен и их анаграмм и имя, по которому он выдаст
    список всех анаграмм этого имени, включая само имя
    ivan, maria, kolya, vani,amari,vian ->
    List<String> anagramsList(String name, List<String>strings)
    ivan ->  vani,vian,ivan
     */
    public static void main(String[] args) {
        List<String> strings = List.of("Ivan", "Maria", "Kolya", "Vani", "Amari", "Vian");

        System.out.println(anagramsList("Vian", strings));


    }

    public static List<String> anagramsList(String name, List<String> strings) {
        List<String> result = new ArrayList<>();
        String temp;
        name = name.toLowerCase();

        for (int i = 0; i < strings.size(); i++) {
            temp = strings.get(i).toLowerCase();

            if (name.length() == temp.length()) {
                List<Character> arrLetters1 = new ArrayList<>();
                List<Character> arrLetters2 = new ArrayList<>();
                for (int j = 0; j < name.length(); j++) {
                    arrLetters1.add(name.charAt(j));
                    arrLetters2.add(temp.charAt(j));
                }
                Collections.sort(arrLetters1);
                Collections.sort(arrLetters2);
                if (arrLetters1.equals(arrLetters2)) {
                    result.add(strings.get(i));
                }
            }
        }
        return result;
    }
}
