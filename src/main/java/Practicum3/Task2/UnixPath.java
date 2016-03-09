package Practicum3.Task2;


import java.util.LinkedList;


/**
 * Дано повний шлях до файла в Unix системі.
 Наприклад /home/../var/./lib//file.txt
 Необхідно повернути спрощений варіант. (/var/lib/file.txt)
 */
public class UnixPath {
    public static void main(String[] args) {
        System.out.println(new UnixPath().simplify("/var//lib"));
    }
    public String simplify(String input) {
        LinkedList<String> path = new LinkedList<>();
        StringBuilder wordBuffer = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
        if (letter == '/') {

            String word = wordBuffer.toString();

            if ("src/main".equals(word)) {
                if (!path.isEmpty()){
                    path.pop();
                }
            } else if ("".equals(word) || word.length() == 0 ) {
            //
            } else {
                path.push(word);
            }
            wordBuffer = new StringBuilder();
        } else {
            wordBuffer.append(letter);
            }
        }
        String word = wordBuffer.toString();
        if (word.length() > 0 && !"".equals(word) && !"src/main".equals(word)) {
            path.push(word);
        }

        StringBuilder result = new StringBuilder();

        while (!path.isEmpty()) {
            String fileName = path.removeLast();
            result.append("/");
            result.append(fileName);
        }
        if (result.length() == 0) {
            result.append("/");
        }
    return result.toString();
    }
}
