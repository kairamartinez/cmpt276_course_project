package cmpt276.courseproject.cmpt276_course_project.courses;

import java.util.ArrayList;
import java.util.List;

// Seperates by !, divides lists by ,

public class Course {
    String identification;
    String name;
    String units;
    List<String> preReqCourses = new ArrayList<>();
    List<String> courseOfferings = new ArrayList<>();
    String complete = "false";
    String stringRepresentation = null;

    public Course(String identification, String name, String description, String units) {
        this.identification = identification;
        this.name = name;
        this.units = units;
    }

    public Course(String identification, String name, String units, List<String> preReqCourses, List<String> courseOfferings, String complete) {
        this.identification = identification;
        this.name = name;
        this.units = units;
        this.preReqCourses = preReqCourses;
        this.courseOfferings = courseOfferings;
        this.complete = complete;
    }

    public void createStringRepresentation() {
        this.stringRepresentation = Course.buildString(this);
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public List<String> getPreReqCourses() {
        return preReqCourses;
    }

    public void setPreReqCourses(List<String> preReqCourses) {
        this.preReqCourses = preReqCourses;
    }

    public List<String> getCourseOfferings() {
        return courseOfferings;
    }

    public void setCourseOfferings(List<String> courseOfferings) {
        this.courseOfferings = courseOfferings;
    }

    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }

    public static String buildString(Course input) {
        return input.identification + "!" + input.name + "!" + input.units +  "!" +
                StringList.buildString(input.preReqCourses, ",") + "!" +
                StringList.buildString(input.courseOfferings, ",") + "!" + input.complete;
    }

    public static Course fromString (String input) {
        String identification = input.substring(0, input.indexOf("!"));
        input = input.substring(input.indexOf("!") + 1);
        String name = input.substring(0, input.indexOf("!"));
        input = input.substring(input.indexOf("!") + 1);
        String units = input.substring(0, input.indexOf("!"));
        input = input.substring(input.indexOf("!") + 1);
        List<String> preReqList = StringList.fromString(input.substring(0, input.indexOf("!")), ",");
        input = input.substring(input.indexOf("!") + 1);
        List<String> coReqList = StringList.fromString(input.substring(0, input.indexOf("!")), ",");
        input = input.substring(input.indexOf("!") + 1);
        String complete = input;
        return new Course(identification, name, units, preReqList, coReqList, complete);
    }

    public String getStringRepresentation() {
        return stringRepresentation;
    }

    public void setStringRepresentation(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }
}
