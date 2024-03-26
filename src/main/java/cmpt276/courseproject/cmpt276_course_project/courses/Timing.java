package cmpt276.courseproject.cmpt276_course_project.courses;

// Seperates by #

public class Timing {
    String course;
    String term; 
    String day;
    String StartTime;
    String EndTime;


    public static String buildString(Timing input) {
        return input.course + "#" + input.term + "#" + input.day + "#" + input.StartTime + "#" + input.EndTime;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public Timing(String course, String term, String day, String startTime, String endTime) {
        this.course = course;
        this.term = term;
        this.day = day;
        StartTime = startTime;
        EndTime = endTime;
    }
    public String getTerm() {
        return term;
    }
    public void setTerm(String term) {
        this.term = term;
    }
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public String getStartTime() {
        return StartTime;
    }
    public void setStartTime(String startTime) {
        StartTime = startTime;
    }
    public String getEndTime() {
        return EndTime;
    }
    public void setEndTime(String endTime) {
        EndTime = endTime;
    }
    public static Timing fromString(String input) {
        String course = input.substring(0, input.indexOf("#"));
        input = input.substring(input.indexOf("#") + 1);
        String term = input.substring(0, input.indexOf("#"));
        input = input.substring(input.indexOf("#") + 1);
        String day = input.substring(0, input.indexOf("#"));
        input = input.substring(input.indexOf("#") + 1);
        String StartTime = input.substring(0, input.indexOf("#"));
        input = input.substring(input.indexOf("#") + 1);
        String EndTime = input;
        return new Timing(course, term, day, StartTime, EndTime);
    }

    public String createLabelTime(String time) {
        if (time.length() == 3) {
            return time.substring(0, 1) + ":" + time.substring(1); 
        } else {
            return time.substring(0, 2) + ":" + time.substring(2); 
        }
    }

    public String returnLabelTiming() {
        return day + " " + createLabelTime(StartTime) + "-" + createLabelTime(EndTime); 
    }
}
