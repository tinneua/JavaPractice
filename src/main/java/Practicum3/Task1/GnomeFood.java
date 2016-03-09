package Practicum3.Task1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * В країні гномів прийнято, що більша порція їжі дістається вищому гному.
 Дано два мисиви int[] довжиною N, з висотами гномів в першому і кілограмами їжі в другому.
 Для кожного i-го гнома треба знайти j-ту порцію їжі і записати в результат j-індекси.
 Приклад:
 [5, 7, 6, 9, 4] - гноми
 [8, 5, 6, 2, 3] - порції
 Найвищому гному з висотою 9 дістається найбільша порція 8 з індексом 0.
 Другий за висотою гном (7), отримує другу завбільшки порцію (6) з індексом 2, і т.д.
 Найнищий (4) отримує найменшу порцію 2 (індекс 3)
 Резульнат
 [4, 2, 1, 0, 3]
 */
public class GnomeFood {
    public static void main(String[] args) {
        int[] gnomes = {5,7,6,9,4};
        int[] portions = {8,5,6,2,3};
        System.out.println(Arrays.toString((new GnomeFood().find(gnomes, portions))));
    }
    public int[] find (int[] gnames, int[] portions) {
        TreeMap<Integer, Integer> mapGnomes = new TreeMap<>();
        TreeMap<Integer, Integer> mapPortions = new TreeMap<>();
        for (int i = 0; i < gnames.length; i++) {
            mapGnomes.put(gnames[i], i);
            mapPortions.put(portions[i],i);
        }
        Iterator iterGnomes = mapGnomes.values().iterator();
        Iterator iterPortions = mapPortions.values().iterator();

        int[] result = new int[gnames.length];
        while (iterGnomes.hasNext()) {
            int i = (int) iterGnomes.next();
            int j = (int) iterPortions.next();
            result[i] = j;
        }
        return result;
    }
}
