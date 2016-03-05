package main.Practicum2.Task4;

/**
 * Дано рядок отриманий шляхом заміни цифр 0,1,2,...,9 певного числа на букви a,b,c,..,j.
 Необхідно повернути початкове число маючи конвертований рядок.
 Наприклад:
 Для "bcd" повернути 123
 */
public class AbcNumber {
    public static void main(String[] args) {
        System.out.println(new AbcNumber().convert("bcd"));
    }
    public int convert(String num) {
        String mask = "abcdefghij";
        String[] array = num.split("");
        String elem = "";
        for (String anArray : array) {
            elem += Integer.toString(mask.indexOf(anArray));
        }
        return Integer.parseInt(elem);
        }
}
