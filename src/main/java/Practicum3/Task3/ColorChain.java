package Practicum3.Task3;

import java.util.HashMap;
import java.util.Map;

/**
 * Дано ланки трьох кольорів: білого і 1 м завдовжки, жовтого - 2 м і червоного - 3 м.
 Скількома способами можна зібрати, з них, ланцюжок довжиною  N.
 Кількість наявних ланок кожного кольору вважати бескінечною.
 */
public class ColorChain {
    public static void main(String[] args) {
        System.out.println(new ColorChain().count(40));
    }
    Map<Integer, Integer> values = new HashMap<>();
    {
        values.put(0,0);
        values.put(1,1);
        values.put(2,2);
        values.put(3,4);
        values.put(-1,0);
        values.put(-2,0);
        values.put(-3,0);
    }
    public int count(int N) {

        if (values.containsKey(N)) {
            return values.get(N);
        }

        int whiteFirst = count(N - 1);
        int yellowFirst = count(N - 2);
        int redFirst = count(N - 3);

        int result = whiteFirst + yellowFirst + redFirst;
        values.put(N, result);

        return result;
    }
}
