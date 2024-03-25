package cmpt276.courseproject.cmpt276_course_project.courses;

// Seperates by #

public class Timing {
    String day;
    String StartTime;
    String EndTime;

    public Timing(String day, String startTime, String endTime) {
        this.day = day;
        StartTime = startTime;
        EndTime = endTime;
    }

    public static String buildString(Timing input) {
        return input.day + "#" + input.StartTime + "#" + input.EndTime;
    }
    public static Timing fromString(String input) {
        String day = input.substring(0, input.indexOf("#"));
        input = input.substring(input.indexOf("#") + 1);
        String StartTime = input.substring(0, input.indexOf("#"));
        input = input.substring(input.indexOf("#") + 1);
        String EndTime = input;
        return new Timing(day, StartTime, EndTime);
    }
}
