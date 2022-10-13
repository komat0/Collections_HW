import java.util.HashMap;

public class UniqueNamesCounter {
    //Create HashMap with Name as Key, and in the loop check same keys, if so add +1 to Value.
    static HashMap<String, Integer> counterUniqueNames = new HashMap<>();


    static void fill() {
        for (int i = 0; i < Exercise1Array.arrayOfNames.size(); i++) {
            if (counterUniqueNames.containsKey(Exercise1Array.arrayOfNames.get(i))) {
                counterUniqueNames.put(Exercise1Array.arrayOfNames.get(i),
                        counterUniqueNames.get(Exercise1Array.arrayOfNames.get(i)) + 1);
            } else {
                counterUniqueNames.put(Exercise1Array.arrayOfNames.get(i), 1);
            }
        }
    }
}
