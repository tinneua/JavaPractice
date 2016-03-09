package Practicum1.Task1;


/**
 * З'єднати масив символів в число.
 Приклад:
 Для [ '1', '2', '3'] повернути 123
 */

public class JoinCharacters {
    public static void main(String[] args) {
    char[] array = {'1','2','3'};
        System.out.println(new JoinCharacters().join(array));
    }
    public int join(char[] input) {
        StringBuilder string = new StringBuilder(input.length);
    for (char c:input) {
        string.append(c);
    }
        return Integer.parseInt(String.valueOf(string));
    }
}
