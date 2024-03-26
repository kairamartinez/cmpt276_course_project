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
    private List<String> finished = new ArrayList<>(); 

    public User() {
    }

    public List<String> getFinished() {
        return finished;
    }
    


    public void setSelected(List<String> finished) {
        this.finished = finished;
    }
 


    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;

    }

    public void addFinished(String course) {
        finished.add(course); 
    }
    public void removeFinished(String course) {
        int index = finished.indexOf(course); 
        finished.remove(index); 
        System.out.println(index); 
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

    public void setAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
