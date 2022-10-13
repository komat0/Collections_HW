import java.util.HashMap;

public class UniqueNamesCounter {
    static int size = NamesList.arrayOfNames.size();
    //Create HashMap with Name as Key, and in the loop check same keys, if so add +1 to Value.
    static HashMap<String, Integer> counterUniqueNames = new HashMap<>();

    static void fill() {
        for (int i = 0; i < size; i++) {
            if (counterUniqueNames.containsKey(NamesList.arrayOfNames.get(i))) {
                counterUniqueNames.put(NamesList.arrayOfNames.get(i),
                        counterUniqueNames.get(NamesList.arrayOfNames.get(i)) + 1);
            } else {
                counterUniqueNames.put(NamesList.arrayOfNames.get(i), 1);
            }
        }
    }
}
