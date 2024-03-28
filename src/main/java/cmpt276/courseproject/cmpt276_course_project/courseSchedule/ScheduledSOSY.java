package cmpt276.courseproject.cmpt276_course_project.courseSchedule;

import java.util.ArrayList;
import java.util.List;

// All scheduled SOSY Classes offered for next term with scheduledLectures specified.

public class ScheduledSOSY {
    public static List<ScheduledCourse> getAllScheduledCourses() {
        List<ScheduledCourse> scheduledCourses = new ArrayList<>();
        scheduledCourses.add(new ScheduledCourse(scheduledCourses.size(), "CMPT 130", "Dr. CMPT", "Location 1"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("Location 1", "Monday", 900, 1000);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("Location 1", "Wednesday", 900, 1000);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("Location 1", "Friday", 900, 1000);
        scheduledCourses.add(new ScheduledCourse(scheduledCourses.size(),"CMPT 135", "Dr. CMPT", "Location 1"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("Location 1", "Monday", 1000, 1100);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("Location 1", "Wednesday", 1000, 1200);
        scheduledCourses.add(new ScheduledCourse(scheduledCourses.size(),"CMPT 105w", "Dr. WRITE", "Location 2"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("Location 2", "Tuesday", 1300, 1500);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("Location 2", "Thursday", 1300, 1500);
        scheduledCourses.add(new ScheduledCourse(scheduledCourses.size(),"CMPT 376w", "Dr. WRITE", "Location 1"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("Location 1", "Tuesday", 1000, 1500);
        scheduledCourses.add(new ScheduledCourse(scheduledCourses.size(),"MATH 151", "Dr. MATH", "Location 1"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("Location 1", "Monday", 1000, 1100);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("Location 1", "Wednesday", 1000, 1100);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("Location 1", "Friday", 1000, 1100);
        scheduledCourses.add(new ScheduledCourse(scheduledCourses.size(),"MATH 152", "Dr. MATH", "Location 1"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("Location 1", "Monday", 1200, 1300);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("Location 1", "Wednesday", 1200, 1300);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("Location 1", "Friday", 1200, 1300);
        return scheduledCourses;
    }
}
