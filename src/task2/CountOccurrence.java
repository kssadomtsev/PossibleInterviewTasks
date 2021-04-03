package task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrence {
    public static void main(String[] args) {
        File file = new File(System.getProperty("user.dir") + "/src/task2/input");
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            in.lines().flatMap(line -> Arrays.stream(line.toLowerCase()
                    .split("[^a-zA-Zа-яА-Я0-9']+")))
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())
                            .thenComparing(Map.Entry::getKey))
                    .limit(10)
                    .forEach(x -> System.out.println(x.getKey()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
