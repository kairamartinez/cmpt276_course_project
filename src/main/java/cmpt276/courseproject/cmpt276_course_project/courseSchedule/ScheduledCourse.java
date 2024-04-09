package cmpt276.courseproject.cmpt276_course_project.courseSchedule;

import java.util.ArrayList;
import java.util.List;

// Class represents information about a particular course including a list of all its scheduledLectures

public class ScheduledCourse {
    String courseNumber; 
    String identification;
    String prof;
    String location; 
    List<ScheduledLecture> scheduledLectures = new ArrayList<>();
    String lectureString = null; 
    String infoString = null; 

    public String getCourseNumber() {
        return courseNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public List<ScheduledLecture> getScheduledLectures() {
        return scheduledLectures;
    }

    public void setScheduledLectures(List<ScheduledLecture> scheduledLectures) {
        this.scheduledLectures = scheduledLectures;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public List<ScheduledLecture> getLectures() {
        return scheduledLectures;
    }

    public void setLectures(List<ScheduledLecture> scheduledLectures) {
        this.scheduledLectures = scheduledLectures;
    }

    public ScheduledCourse(String courseNumber, String identification, String prof, String location) {
        this.courseNumber = courseNumber; 
        this.identification = identification;
        this.prof = prof;
        this.location = location; 
    }

    public void addLecture(String location, String day, int startTime, int endTime) {
        scheduledLectures.add(new ScheduledLecture(this.identification, location, day, startTime, endTime));
    }

    public void setLectureString() {
        StringBuilder lectureString  = new StringBuilder("Lectures: ");
        for (ScheduledLecture lecture : scheduledLectures) {
            lectureString.append(lecture.stringRepresentation).append(" ");
        }
        this.lectureString = lectureString.toString();
    }

    public String getLectureString() {
        return lectureString;
    }

    public void setInfoString() {
        this.infoString = identification + " with " + prof + " at " + location; 
    }

    public String getInfoString() {
        return infoString;
    }

}
