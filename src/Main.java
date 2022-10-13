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

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        //Printing Exercise Array.
        System.out.println(NamesList.arrayOfNames);

        //Add all names from arrayOfNames to HashSet. Added only unique names, because HashSet don't support same Values.
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.addAll(NamesList.arrayOfNames);
        /*
        Same result, but different writing:
        Iterator<String> iterator = arrayOfNames.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            uniqueNames.add(str);
        }
        */

        UniqueNamesCounter.fill();

        System.out.println(uniqueNames);
        System.out.println(UniqueNamesCounter.counterUniqueNames);

        PhoneBook pb = new PhoneBook();
        pb.addContact("Ivanov", "222333");
        pb.addContact("Ivanov", "333555");
        pb.addContact("Dingo", "111111");

        pb.getAllContacts();
        pb.getContact("Ivanov");
    }
}