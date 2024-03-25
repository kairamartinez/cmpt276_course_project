package cmpt276.courseproject.cmpt276_course_project.courses;

import java.util.ArrayList;
import java.util.List;

public class StringList {
    public static String buildString (List<String> input, String divider) {
        String stringList = "(";
        for (String string : input) {
            stringList = stringList + string + divider;
        }
        return stringList + ")";
    }
    public static List<String> fromString(String input, String divider) {
        List<String> list = new ArrayList<>();
        input = input.substring(1);
        while (input.length() > 1) {
            String element = input.substring(0, input.indexOf(divider));
            list.add(element);
            input = input.substring(input.indexOf(divider)+1);
        }
        return list;
    }
}
