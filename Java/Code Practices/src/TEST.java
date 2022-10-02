
import java.util.Map;
import java.util.TreeMap;

public class TEST {

    public static String getUserName(String firstName, String lastName) {
        firstName = capitaliseFirstLetter(firstName);
        lastName = capitaliseFirstLetter(lastName);
        String name;
        String temp = firstName;
        firstName = lastName;
        lastName = temp;
        if (firstName == null) {
            name = "null, " + lastName;
        } else if (lastName == null) {
            name = firstName + ", null";
        } else {
            name = firstName + ", " + lastName;
        }

        return name;
        // return the user name as LastName, FirstName e.g. Smith, John
    }

    public static String capitaliseFirstLetter(String s) {

        if (s == null || s.length() < 1) {
            return s;
        }
        s = s.replaceAll("\\s+", "");
        char[] chars = s.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String firstname = null;

        String lastname = "     o'Reilly";

        System.out.println(getUserName(firstname, lastname));
    }
}
