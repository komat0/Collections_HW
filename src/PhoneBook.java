import java.util.*;

public class PhoneBook {

    public HashMap<String, List<String>> phoneBookList = new HashMap<>() {{
        put("Sidorov", List.of("2223355"));
    }};

    public void addContact(String name, String phone) {
        if (phoneBookList.containsKey(name)) {
            phoneBookList.get(name).add(phone);
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phone);
            phoneBookList.put(name, numbers);
        }
    }
    public void getAllContacts () {
        System.out.println(phoneBookList.entrySet());
    }

    public  List<String> getContact(String name) {
        if (phoneBookList.containsKey(name)) {
            System.out.println("The numbers of " + name + ":");
            System.out.println(phoneBookList.get(name));
            return phoneBookList.get(name);
        }
        return null;
    }
}
