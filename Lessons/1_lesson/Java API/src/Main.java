import java.lang.Integer;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        String s_num = "ALi";
//        Integer num = Integer.parseInt(s_num);
//        if(num instanceof Integer){
//            System.out.println("it's int");
//        } else {
//            System.out.println("it's string");
//        }
//        System.out.println(s_num.getClass().getSimpleName());

        s_num.length();
        System.out.println(s_num.toUpperCase());

        System.out.println(s_num.equals(s_num));

        StringBuilder sb = new StringBuilder(s_num);
        sb.append(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.reverse());
    }
}

///String

// charAt() - for examining individual characters of theString
// compareTo() - for comparing strings alphabetically
// substring() - for extracting substrings
// toLowerCase(), toUpperCase() - for creating a copy of a string
//with all characters translated to uppercase or to lowercase.
// length() - returns the number of characters contained in the string
//object.
// split() - Splits the string by some separator

///Vector

//Vector<String> students = new Vector<String>();
//students.add("Elmira");
//students.add("Guizal");
//for(String cur: students)
//System.out.println(cur);

///

///Enumerations
enum Season { SPRING, SUMMER, AUTUMN, WINTER };
enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
    FRIDAY, SATURDAY };
enum Gender { MALE, FEMALE};
enum Size { XS, S, M, L, XL, XXL};
//You need to understand that enum values are not variables. Actually,
//each enum value is a constant (remember that constant names are written
//uppercased!) that always has the same value. You can refer to them as
////Season.SPRING, Season.SUMMER, etc.

Gender g = Gender.MALE;
Day d = Day.SATURDAY;
Season s = Season.SPRING;