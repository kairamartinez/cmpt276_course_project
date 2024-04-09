package cmpt276.courseproject.cmpt276_course_project.models;

import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    private String name;
    private String password;
    private Boolean isAdmin;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Course> courses;

    public User() {
    }

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void finishedCourse(String courseName) {
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                course.setComplete(true);
            }
        }
    }

    public void unfinishedCourse(String courseName) {
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                course.setComplete(false);
            }
        }
    }
}
