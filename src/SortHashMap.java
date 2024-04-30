import java.util.*;

public class SortHashMap {
    public static void sortHashMap(){

        HashMap<String, Integer> hashMaptask = new HashMap<>();
        hashMaptask.put("John", 32);
        hashMaptask.put("Steve", 30);
        hashMaptask.put("Angie", 33);

        HashMap<String, Integer> newHashMap = new LinkedHashMap<>();

        hashMaptask.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(a -> newHashMap.put(a.getKey(), a.getValue()));
        newHashMap.forEach((key, value) -> System.out.println(key +" "+ value));

    }
}
