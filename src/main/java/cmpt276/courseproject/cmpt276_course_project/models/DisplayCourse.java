package cmpt276.courseproject.cmpt276_course_project.models;

import java.util.List;

public class DisplayCourse extends Course {
    private String prerequisites;
    private List<Course> SoSyPrerequisites;

    public DisplayCourse(Course course) {
        super(course.getName(), course.isComplete());
        setUser(course.getUser());
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public List<Course> SoSyPrerequisites() {
        return SoSyPrerequisites;
    }

    public void setSoSyPrerequisites(List<Course> SoSyPrerequisites) {
        this.SoSyPrerequisites = SoSyPrerequisites;
    }
}
