package cmpt276.courseproject.cmpt276_course_project.courses;

/**
 * Course Offerings represents indivdual Offerings
 * The string representation, build string, from string are used to serialize and deserialize from database and move information around html pages.
 * Serialized seperates by * and divides lists by %
 * The label for choice is for the front end when displaying choices. 
 */

import java.util.*;
public class CourseOffering {
    String term;
    String campus;
    String prof;
    List<String> lectures = new ArrayList<>();
    String stringRepresentation = null;
    String labelForChoice = null; 

    public void createStringRepresentation() {
        this.stringRepresentation = CourseOffering.buildString(this);
    }

    public String getLabelForChoice() {
        return labelForChoice;
    }

    public void setLabelForChoice(String labelForChoice) {
        this.labelForChoice = labelForChoice;
    }

    public void createLabelForChoice() {
        String label = "Lectures: "; 
        for (String string : lectures) {
            Timing lectureTime = Timing.fromString(string); 
            label = label + lectureTime.returnLabelTiming() + ", "; 
        }  
        label = label.substring(0, label.length()-2); 
        this.labelForChoice = label; 
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
