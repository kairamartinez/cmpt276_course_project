package cmpt276.courseproject.cmpt276_course_project.courseSchedule;

// Class represents information about a particular lecture
// Function able to check if two scheduledLectures are overlapping by time or location
// Uses a 24 hour clock.

public class ScheduledLecture {
    String course;
    String location;
    String day;
    int startTime;
    int endTime;
    String stringRepresentation; 

    public ScheduledLecture(String course, String location, String day, int startTime, int endTime) {
        this.course = course;
        this.location = location;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        this.stringRepresentation = setStringRepresentation(); 
    };

    public String getStringRepresentation() {
        return stringRepresentation; 
    }

    private String setStringRepresentation() {
        return day + " " + getTimeRepresentation(startTime) + "-" + getTimeRepresentation(endTime); 
    }

    private String getTimeRepresentation(int timeInt) {
        String timeString = String.valueOf(timeInt); 
        if (timeString.length() == 3) {
            return timeString.substring(0, 1) + ":" + timeString.substring(1); 
        } else {
            return timeString.substring(0, 2) + ":" + timeString.substring(2); 
        }
    }

    public String getDisplayRepresentation() {
        return course + " " + location + " " + getTimeRepresentation(startTime) + "-" + getTimeRepresentation(endTime);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public boolean overlappingLecture(ScheduledLecture scheduledLecture) {
        // Give 2 hourse between if on different locations 
        if (this.location != scheduledLecture.location) {
            if (this.endTime+2 > scheduledLecture.startTime) {
                return true;
            } else {
                return false;
            }
        }
        // Otherwise no extra time given 
        else {
            if (this.endTime > scheduledLecture.startTime) {
                return true;
            } else {
                return false;
            }
        }
    }
}