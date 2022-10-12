import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        int uniqCounter = 0;

        ArrayList<String> exercise1 = new ArrayList<String>();
        exercise1.add("John");
        exercise1.add("Mike");
        exercise1.add("Anna");
        exercise1.add("Oksana");
        exercise1.add("Max");
        exercise1.add("Barry");
        exercise1.add("Alexandr");
        exercise1.add("Bob");
        exercise1.add("Mike");
        exercise1.add("Vera");
        exercise1.add("Anna");
        exercise1.add("Vika");
        exercise1.add("Sergio");
        exercise1.add("John");
        exercise1.add("John");

        System.out.println(exercise1);

        HashMap<String, Integer> counterUniqueNames = new HashMap<>();

        for (int i = 0; i < exercise1.size(); i++) {
            if (counterUniqueNames.containsKey(exercise1.get(i))) {
                counterUniqueNames.put(exercise1.get(i), counterUniqueNames.get(exercise1.get(i)) + 1);
            } else {
                counterUniqueNames.put(exercise1.get(i), 1);
                    }
            }
        System.out.println(counterUniqueNames);
    }
}