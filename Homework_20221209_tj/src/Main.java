import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*
        Дана Map<String,String> ab. Написать метод который вернёт мапуБ такую что если в
        исходной мапе есть ключи "а" и "в", то нужно создать новый ключ под название "ав",
        где значение будет суммой значений от ключей а и в. Если такого значения нет,
         ничего менять не нужно.
         Примеры:
         mapAB {a : Hi , b : There} -> {a:Hi , ab:HiThere, b:There}
         mapAB {a:Hi} -> {a:Hi}
         public Map<String,String> ab (Map<String,String> mapAB)
         */
        Map<String,String> mapAB1 = new HashMap<>();
        mapAB1.put("a","Hi");
        mapAB1.put("b","There");
        System.out.println(ab(mapAB1));
        Map<String,String> mapAB2 = new HashMap<>();
        mapAB2.put("a","Hi");
        System.out.println(ab(mapAB2));
        Map<String,String> mapAB3 = new HashMap<>();
        mapAB3.put("b","There");
        System.out.println(ab(mapAB3));
    }
    public static Map<String,String> ab(Map<String,String> mapAB){

        if (mapAB.containsKey("a") && mapAB.containsKey("b")){
            mapAB.put("ab", mapAB.get("a") + mapAB.get("b"));
        }

        return mapAB;
    }
}