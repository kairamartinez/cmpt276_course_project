package cmpt276.courseproject.cmpt276_course_project.courseSchedule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Gets selected Classes from form and generates a schedule to display, will be linked to controller

public class ScheduleCreator {
    public static void run() {
        // Get Selected Courses, for now assuming all selected
        List<ScheduledCourse> selectedCourses = ScheduledSOSY.getAllScheduledCourses();

        // Get All Lectures
        List<ScheduledLecture> allScheduledLectures = new ArrayList<>();
        for (ScheduledCourse scheduledCourse : selectedCourses) {
            allScheduledLectures.addAll(scheduledCourse.getLectures());
        }

        // Seperate  Lectures into Week Days
        List<String> weekDays = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"));
        List<List<ScheduledLecture>> weekLectures = createWeek (allScheduledLectures, weekDays);

        // Display
        System.out.println("Week Schedule");
        for (int i = 0; i < weekLectures.size(); i++) {
            displayDay(weekLectures.get(i), weekDays.get(i));
        }
    }

    // Given a list of Lectures, sort them into a complete week
    public static List<List<ScheduledLecture>>  createWeek(List<ScheduledLecture> allScheduledLectures, List<String> weekDays) {
        List<List<ScheduledLecture>> weekLectures = new ArrayList<>();
        for (String weekDay : weekDays) {
            List<ScheduledLecture> daysScheduledLecture = new ArrayList<>();
            for (ScheduledLecture scheduledLecture : allScheduledLectures) {
                if (scheduledLecture.getDay().equals(weekDay)) {
                    daysScheduledLecture.add(scheduledLecture);
                }
            }
            daysScheduledLecture.sort(new Comparator<ScheduledLecture>() {
                @Override
                public int compare(ScheduledLecture o1, ScheduledLecture o2) {
                    return o1.startTime - o2.startTime;
                }
            });
            weekLectures.add(daysScheduledLecture);
        }
        return weekLectures;
    }

    // Display an indivdual Day's information formatted
    public static void displayDay (List<ScheduledLecture> allScheduledLectures, String dayName) {
        List<ScheduledLecture> overlappingScheduledLectures = checkOverlapping(allScheduledLectures);
        List<ScheduledLecture> verifiedScheduledLectures = new ArrayList<>();
        for (ScheduledLecture scheduledLecture : allScheduledLectures) {
            if (!overlappingScheduledLectures.contains(scheduledLecture)) {
                verifiedScheduledLectures.add(scheduledLecture);
            }
        }

       System.out.println("\t" + dayName);
        for (int i = 0; i < overlappingScheduledLectures.size(); i = i+2) {
            System.out.println("\t\tOverlapping Lectures for " + overlappingScheduledLectures.get(i).getCourse() + " and " + overlappingScheduledLectures.get(i+1).getCourse());
        }
        for (ScheduledLecture scheduledLecture : allScheduledLectures) {
            System.out.println("\t\t" + scheduledLecture.getCourse() + " " + scheduledLecture.getLocation() + " " + scheduledLecture.getStartTime() + " " + scheduledLecture.getEndTime());
        }
    }

    // Find a list of overlapping classes
    public static List<ScheduledLecture> checkOverlapping (List<ScheduledLecture> day) {
        List<ScheduledLecture> overlapping = new ArrayList<>();
        for (int i = 0; i < day.size()-1; i++) {
            boolean isOverlapping = day.get(i).overlappingLecture(day.get(i+1));
            if (isOverlapping) {
                overlapping.add(day.get(i));
                overlapping.add(day.get(i+1));
                i = i + 1;
            }
        }
        return overlapping;
    }
}
