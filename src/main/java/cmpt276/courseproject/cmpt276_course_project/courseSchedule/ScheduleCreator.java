package cmpt276.courseproject.cmpt276_course_project.courseSchedule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Gets selected classes from form and generate a schedule to display, will be linked to controller

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
        
        // Seperate lectures into week
        for (String weekDay : weekDays) {
            List<ScheduledLecture> dayLectures = new ArrayList<>(); 
            dayLectures.addAll(allLectures); 
            dayLectures.removeIf(lecture -> !(lecture.getDay().equals(weekDay)));
            dayLectures.sort((o1, o2) -> o1.startTime - o2.startTime); 
            weekLectures.add(dayLectures);
        }
    
        // Get day display for whole week. 
        for (List<ScheduledLecture> dayLectures : weekLectures) {
            // Find overlapping
            List<String> dayDisplay = new ArrayList<>(); 
            List<ScheduledLecture> overlappingLectures = findOverlapping(dayLectures); 
            List<ScheduledLecture> verifiedLectures = dayLectures; 
            verifiedLectures.removeAll(overlappingLectures); 

            // Display for lectures
            for (int i = 0; i < overlappingLectures.size(); i = i+2) {
                String course1 = overlappingLectures.get(i).getCourse(); 
                String course2 = overlappingLectures.get(i+1).getCourse(); 
                dayDisplay.add("Overlapping Lectures for " + course1 + " and " + course2);
            }
            for (ScheduledLecture lecture: verifiedLectures) {
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

