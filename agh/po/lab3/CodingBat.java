package agh.po.lab3;
import java.util.HashMap;
import java.util.Map;
public class CodingBat {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        }
        return a + b;
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }

    public static void main(String[] args) {
        CodingBat zadania = new CodingBat();

        System.out.println("sleepIn (false, true): " + zadania.sleepIn(false, true));
        System.out.println("sumDouble (2, 2): " + zadania.sumDouble(2, 2));
        System.out.println("helloName (\"Bob\"): " + zadania.helloName("Bob"));

        int[] tablicaTestowa = {2, 1, 2, 3, 4};
        System.out.println("countEvens ([2, 1, 2, 3, 4]): " + zadania.countEvens(tablicaTestowa));

        Map<String, String> mapaTestowa = new HashMap<>();
        mapaTestowa.put("a", "Hi");
        mapaTestowa.put("b", "There");
        System.out.println("mapAB: " + zadania.mapAB(mapaTestowa));

        String[] tablicaStringow = {"a", "bb", "a", "bb"};
        System.out.println("wordLen: " + zadania.wordLen(tablicaStringow));
    }
}
