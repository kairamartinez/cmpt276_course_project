package cmpt276.courseproject.cmpt276_course_project.courseList;

// Course object for list display. 

public class ListCourse{
    String name; 
    boolean finish;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isFinish() {
        return finish;
    }
    public void setFinish(boolean finish) {
        this.finish = finish;
    }
    public ListCourse(String name, boolean finish) {
        this.name = name;
        this.finish = finish;
    } 
}
