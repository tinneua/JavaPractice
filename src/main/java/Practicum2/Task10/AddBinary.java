package Practicum2.Task10;


/**
 * Додайте два беззнакових числа, що передаються як рядки.
 "101" + "100" = "1001"
 */
public class AddBinary {
    public static void main(String[] args) {
        System.out.println(new AddBinary().add("101","100"));
    }
    String add(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        int i = 0;
        int temp = 0;
        StringBuilder result = new StringBuilder();
        while (i < aLength || i < bLength) {
            char aTemp = ( i < aLength) ? a.charAt(aLength - i - 1) : '0';
            char bTemp = ( i < bLength) ? b.charAt(bLength - i - 1) : '0';
         int sum = (aTemp - '0') + (bTemp - '0') + temp;
            switch (sum) {
                case 0:
                    result.append('0');
                    temp = 0;
                    break;
                case 1:
                    result.append('1');
                    temp = 0;
                    break;
                case 2:
                    result.append('0');
                    temp = 1;
                    break;
                case 3:
                    result.append('1');
                    temp = 1;
                    break;
            }
            i++;
        }
        if (temp == 1) result.append('1');
    return result.reverse().toString();
    }
}
