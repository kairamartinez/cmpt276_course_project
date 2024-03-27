package cmpt276.courseproject.cmpt276_course_project.backEnd;

import java.util.ArrayList;
import java.util.List;

// Generates list of SOSY Classes and compares them to completed list to output toCompleteList

public class CourseCreator {
    public static List<String> generateSOSYCourses() {
        List<String> courses = new ArrayList<>();
        courses.add("CMPT 105w");
        courses.add("CMPT 130");
        courses.add("CMPT 135");
        courses.add("CMPT 210");
        courses.add("CMPT 213");
        courses.add("CMPT 225");
        courses.add("CMPT 276");
        courses.add("CMPT 295");
        courses.add("CMPT 300");
        courses.add("CMPT 300");
        courses.add("CMPT 307");
        courses.add("CMPT 354");
        courses.add("CMPT 371");
        courses.add("CMPT 373");
        courses.add("CMPT 376w");
        courses.add("CMPT 379");
        courses.add("CMPT 383");
        courses.add("CMPT 384");
        courses.add("CMPT 431");
        courses.add("CMPT 433");
        courses.add("CMPT 454");
        courses.add("CMPT 471");
        courses.add("CMPT 473");
        courses.add("CMPT 474");
        courses.add("CMPT 477");
        courses.add("CMPT 494");
        courses.add("CMPT 495");
        courses.add("MACM 101");
        courses.add("MATH 150/MATH 151");
        courses.add("MATH 232");
        courses.add("MSE 110");
        courses.add("STAT 271");
        return courses;
    }

    public static List<String> toCompleteCoursesList(List<String> allCourses, List<String> completed) {
        List<String> toComplete = new ArrayList<>();
        for (String course : allCourses) {
            if (!(completed.contains(course))) {
                toComplete.add(course);
            }
        }
        // test 
        assert(toComplete != null); 
        return toComplete;
    }
}