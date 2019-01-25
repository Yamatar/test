package tasks;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        sc.close();
        Map<String, Integer> map = new HashMap<>();
        for (String word: words) {
            map.merge(word, 1, (oldValue, newValue) -> oldValue + newValue);
        }
        map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(System.out::println);
    }
}
