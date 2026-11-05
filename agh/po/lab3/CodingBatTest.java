package agh.po.lab3;

import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class CodingBatTest {

    CodingBat zadania = new CodingBat();

    @Test
    public void sleepIn() {
        assertEquals(true, zadania.sleepIn(false, false));
        assertEquals(false, zadania.sleepIn(true, false));
        assertEquals(true, zadania.sleepIn(false, true));
    }

    @Test
    public void sumDouble() {
        assertEquals(3, zadania.sumDouble(1, 2));
        assertEquals(5, zadania.sumDouble(3, 2));
        assertEquals(8, zadania.sumDouble(2, 2));
    }

    @Test
    public void helloName() {
        assertEquals("Hello Bob!", zadania.helloName("Bob"));
        assertEquals("Hello Alice!", zadania.helloName("Alice"));
        assertEquals("Hello X!", zadania.helloName("X"));
    }

    @Test
    public void countEvens() {
        assertEquals(3, zadania.countEvens(new int[]{2, 1, 2, 3, 4}));
        assertEquals(3, zadania.countEvens(new int[]{2, 2, 0}));
        assertEquals(0, zadania.countEvens(new int[]{1, 3, 5}));
    }

    @Test
    public void mapAB() {
        Map<String, String> map1 = new HashMap<>(); map1.put("a", "Hi"); map1.put("b", "There");
        Map<String, String> expected1 = new HashMap<>(map1); expected1.put("ab", "HiThere");
        assertEquals(expected1, zadania.mapAB(map1));

        Map<String, String> map2 = new HashMap<>(); map2.put("a", "Hi");
        assertEquals(map2, zadania.mapAB(map2));

        Map<String, String> map3 = new HashMap<>(); map3.put("b", "There");
        assertEquals(map3, zadania.mapAB(map3));
    }

    @Test
    public void wordLen() {
        Map<String, Integer> expected1 = new HashMap<>(); expected1.put("bb", 2); expected1.put("a", 1);
        assertEquals(expected1, zadania.wordLen(new String[]{"a", "bb", "a", "bb"}));

        Map<String, Integer> expected2 = new HashMap<>(); expected2.put("that", 4); expected2.put("and", 3); expected2.put("this", 4);
        assertEquals(expected2, zadania.wordLen(new String[]{"this", "and", "that", "and"}));
    }
}