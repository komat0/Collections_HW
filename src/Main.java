/*
Exercise:
1) Create an array with a set of words (10-20 words, there should be duplicates). Find and
output a list of unique words that make up the array (we do not count duplicates).
Count how many times each word occurs.
2 Write a simple Phone Book class that stores a list of last names and
phone numbers. In this phone book, using the add () method, you can
add entries, and use the get() method to look up a phone number by last name. Should
take into account that under one surname there can be several phones (in the case of namesakes),
then, when such a surname is requested, all phones should be displayed. Preferably not
add extra functionality (additional fields (name, patronymic, address), interaction with
by the user through the console, etc.). Use the console only to display the results of the check
telephone directory.
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayOfNames = new ArrayList<String>();
        arrayOfNames.add("John");
        arrayOfNames.add("Mike");
        arrayOfNames.add("Anna");
        arrayOfNames.add("Oksana");
        arrayOfNames.add("Max");
        arrayOfNames.add("Barry");
        arrayOfNames.add("Alexandr");
        arrayOfNames.add("Bob");
        arrayOfNames.add("Mike");
        arrayOfNames.add("Vera");
        arrayOfNames.add("Anna");
        arrayOfNames.add("Vika");
        arrayOfNames.add("Sergio");
        arrayOfNames.add("John");
        arrayOfNames.add("John");

        System.out.println(arrayOfNames);

        HashSet<String> uniqueNames = new HashSet<>();
        //Add all names from arrayOfNames to HashSet. Added only unique names, because HashSet dont support same Values.
        uniqueNames.addAll(arrayOfNames);

        /*        Same result, but different writing:
        Iterator<String> iterator = arrayOfNames.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            uniqueNames.add(str);
        }*/

        //Create HashMap with Name as Key, and in the loop check same keys, if so add +1 to Value.
        HashMap<String, Integer> counterUniqueNames = new HashMap<>();
        for (int i = 0; i < arrayOfNames.size(); i++) {
            if (counterUniqueNames.containsKey(arrayOfNames.get(i))) {
                counterUniqueNames.put(arrayOfNames.get(i), counterUniqueNames.get(arrayOfNames.get(i)) + 1);
            } else {
                counterUniqueNames.put(arrayOfNames.get(i), 1);
                    }
            }
        System.out.println(uniqueNames);
        System.out.println(counterUniqueNames);
    }
}