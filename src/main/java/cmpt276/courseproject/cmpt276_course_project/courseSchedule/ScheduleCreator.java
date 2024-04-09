package cmpt276.courseproject.cmpt276_course_project.courseSchedule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Gets selected classes from form and generate a schedule to display, linked to controller. 
// No restrictions on what classes can be chosen for schedule thus no extra tests required here. 

public class ScheduleCreator {
    public static List<List<String>> generateSchedule(List<String> chosenCourseNumbers) {

        // Set up arrays 
        List<ScheduledLecture> allLectures = new ArrayList<>();
        List<List<ScheduledLecture>> weekLectures = new ArrayList<>(); 
        List<String> weekDays = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"));
        List<List<String>> weekSchedule = new ArrayList<>(); 


        // Collect all lectures 
        for (ScheduledCourse course: ScheduledSOSY.getAllScheduledCourses()) {
            if (chosenCourseNumbers.contains(course.getCourseNumber())) {
                allLectures.addAll(course.getLectures()); 
            }
        }
        
        // Separate lectures into week
        for (String weekDay : weekDays) {
            List<ScheduledLecture> dayLectures = new ArrayList<>(allLectures);
            dayLectures.removeIf(lecture -> !(lecture.getDay().equals(weekDay)));
            dayLectures.sort(Comparator.comparingInt(o -> o.startTime));
            weekLectures.add(dayLectures);
        }
    
        // Get day display for whole week. 
        for (List<ScheduledLecture> dayLectures : weekLectures) {
            // Find overlapping
            List<String> dayDisplay = new ArrayList<>(); 
            List<ScheduledLecture> overlappingLectures = findOverlapping(dayLectures);
            dayLectures.removeAll(overlappingLectures);

            // Display for lectures
            for (int i = 0; i < overlappingLectures.size(); i = i+2) {
                String course1 = overlappingLectures.get(i).getCourse(); 
                String course2 = overlappingLectures.get(i+1).getCourse(); 
                dayDisplay.add("Overlapping Lectures for " + course1 + " and " + course2);
            }
            for (ScheduledLecture lecture: dayLectures) {
                dayDisplay.add(lecture.getDisplayRepresentation()); 
            }
            weekSchedule.add(dayDisplay);   
        }

        return weekSchedule; 
    }

    // Find overlapping lectures.
    private static List<ScheduledLecture> findOverlapping (List<ScheduledLecture> dayLectures) {
        List<ScheduledLecture> overlappingLectures = new ArrayList<>();
        for (int i = 0; i < dayLectures.size()-1; i++) {
            boolean isOverlapping = dayLectures.get(i).overlappingLecture(dayLectures.get(i+1));
            if (isOverlapping) {
                overlappingLectures.add(dayLectures.get(i));
                overlappingLectures.add(dayLectures.get(i+1));
                i = i + 1;
            } 
        }
        return overlappingLectures;
    }
}

