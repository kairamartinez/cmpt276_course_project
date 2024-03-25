package cmpt276.courseproject.cmpt276_course_project.courses;

// Seperates by *, divides lists by %

import java.util.*;
public class CourseOffering {
    String term;
    String campus;
    String prof;
    List<String> lectures = new ArrayList<>();
    String stringRepresentation = null;

    public void createStringRepresentation() {
        this.stringRepresentation = CourseOffering.buildString(this);
    }

    public CourseOffering(String term, String campus, String prof, List<String> lectures) {
        this.term = term;
        this.campus = campus;
        this.prof = prof;
        this.lectures = lectures;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public List<String> getLectures() {
        return lectures;
    }

    public void setLectures(List<String> lectures) {
        this.lectures = lectures;
    }

    public String getStringRepresentation() {
        return stringRepresentation;
    }

    public void setStringRepresentation(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    public static String buildString(CourseOffering input) {
        return input.term + "*" + input.campus + "*" + input.prof + "*" + StringList.buildString(input.lectures, "%");
    }

    public static CourseOffering fromString (String input) {
        String term = input.substring(0, input.indexOf("*"));
        input = input.substring(input.indexOf("*") + 1);
        String campus = input.substring(0, input.indexOf("*"));
        input = input.substring(input.indexOf("*") + 1);
        String prof = input.substring(0, input.indexOf("*"));
        input = input.substring(input.indexOf("*") + 1);
        List<String> lectures = StringList.fromString(input, "%");
        return new CourseOffering(term, campus, prof, lectures);
    }
}
