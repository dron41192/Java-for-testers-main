package task_6;

import java.io.*;
import java.nio.file.NoSuchFileException;
import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.util.Comparator.comparingInt;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        String fileName = "words.txt";

        try {
            read(fileName, list);
            count(list);
            print(list);
            sort(list);
        } catch (NoSuchFileException e) {
            System.out.println("Error: file not found.");
        }
    }

    /**
     * Read using scanner.
     * @param fileName 'words.txt'.
     * @param list ArrayList.
     * @throws IOException
     */
    private static void read(String fileName, List<String> list) throws IOException {
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);
        while (scanner.hasNext()) {
            String line = scanner.next();
            list.add(line);
        }
    }

    /**
     * Calculate the number of words.
     * @param list ArrayList.
     * @return Map with word (key) and number of repetitions (value).
     */
    public static Map<String, Integer> count(List<String> list) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : list) {
            Integer x = map.get(s);
            if (x == null) {
                map.put(s, 1);
            } else map.put(s, x + 1);
        }
        return map;
    }

    /**
     * Print the word with the maximum number of repetitions.
     * @param list ArrayList
     */
    public static void print(List<String> list) {
        System.out.println("Слово с максимальным количеством повторений: " +
                Collections.max(count(list).entrySet(), comparingInt(Map.Entry::getValue)).getKey() +
                " - " +
                Collections.max(count(list).entrySet(), comparingInt(Map.Entry::getValue)).getValue());
    }

    /**
     * Sort alphabetically.
     * @param list ArrayList.
     */
    public static void sort(List<String> list) {
        Map<String, Integer> sortedMap = new TreeMap<>(count(list));

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " - " + value);
        }
    }
}