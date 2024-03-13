package cmpt276.courseproject.cmpt276_course_project.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
    List<User> findByName(String name);
    List<User> findByNameAndPassword(String name, String password);
}
