package cmpt276.courseproject.cmpt276_course_project.courseSchedule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Gets selected Classes from form and generates a schedule to display, will be linked to controller

public class ScheduleCreator {
    public static List<List<String>> generateSchedule(List<String> chosenCourseNumbers) {

        // Get all lectures 
        List<ScheduledLecture> lectures = getAllLectures(chosenCourseNumbers);

        // Seperate lectures into week days
        List<String> weekDays = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"));
        List<List<ScheduledLecture>> weekLectures = ScheduleCreator.createWeek (lectures, weekDays);

        // Get day display for whole week. 
        List<List<String>> weekSchedule = new ArrayList<>(); 
        for (int i = 0; i < weekLectures.size(); i++) {
            weekSchedule.add(getDayDisplay(weekLectures.get(i)));   
        }

        return weekSchedule; 
    }

    // Get chosen lectures from chosen course numbers. 
    private static List<ScheduledLecture> getAllLectures (List<String> chosenCourseNumbers) {
        List<ScheduledCourse> allCourses = ScheduledSOSY.getAllScheduledCourses();
        List<ScheduledLecture> lectures = new ArrayList<>();
        for (ScheduledCourse course: allCourses) {
            if (chosenCourseNumbers.contains(course.getCourseNumber())) {
                lectures.addAll(course.getLectures()); 
            }        
        }
        return lectures; 
    }

    // Sort lectures into a complete week
    private static List<List<ScheduledLecture>> createWeek(List<ScheduledLecture> allScheduledLectures, List<String> weekDays) {
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

    // Get a particular days display
    private static List<String> getDayDisplay(List<ScheduledLecture> daysLectures) {
        List<String> dayDisplay = new ArrayList<>(); 

        // display for overlapping lecutres 
        List<ScheduledLecture> overlappingLectures = findOverlapping(daysLectures); 
        for (int i = 0; i < overlappingLectures.size(); i = i+2) {
            dayDisplay.add("Overlapping Lectures for " + overlappingLectures.get(i).getCourse() + " and " + overlappingLectures.get(i+1).getCourse());
        }

        // display for non-overlapping lectures 
        List<ScheduledLecture> verifiedLectures = daysLectures; 
        verifiedLectures.removeAll(overlappingLectures); 
        for (ScheduledLecture lecture: verifiedLectures) {
            dayDisplay.add(lecture.getDisplayRepresentation()); 
        }

        return dayDisplay; 
    }

    // Find overlapping lectures.
    private static List<ScheduledLecture> findOverlapping (List<ScheduledLecture> day) {
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
