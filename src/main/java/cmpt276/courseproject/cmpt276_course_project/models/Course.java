package cmpt276.courseproject.cmpt276_course_project.models;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;
    private String courseName;
    private boolean isComplete;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Course() {
    }

    public Course(String name, boolean completed) {
        this.courseName = name;
        this.isComplete = completed;
    }

    public String getName() {
        return courseName;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean completed) {
        this.isComplete = completed;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
