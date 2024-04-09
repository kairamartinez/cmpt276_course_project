package cmpt276.courseproject.cmpt276_course_project.models;

import java.util.ArrayList;
import java.util.List;

public final class SoSyCourses {
    public static List<DisplayCourse> generateSoSyCourses() {
        List<DisplayCourse> courses = new ArrayList<>();

        // Create DisplayCourse objects and add them to the list
        courses.add(new DisplayCourse(new Course("CMPT 105W", false)));
        courses.add(new DisplayCourse(new Course("CMPT 130", false)));
        courses.add(new DisplayCourse(new Course("CMPT 135", false)));
        courses.add(new DisplayCourse(new Course("CMPT 210", false)));
        courses.add(new DisplayCourse(new Course("CMPT 213", false)));
        courses.add(new DisplayCourse(new Course("CMPT 225", false)));
        courses.add(new DisplayCourse(new Course("CMPT 276", false)));
        courses.add(new DisplayCourse(new Course("CMPT 295", false)));
        courses.add(new DisplayCourse(new Course("MACM 101", false)));
        courses.add(new DisplayCourse(new Course("MSE 110", false)));
        courses.add(new DisplayCourse(new Course("STAT 271", false)));
        courses.add(new DisplayCourse(new Course("MATH 150", false)));
        courses.add(new DisplayCourse(new Course("MATH 151", false)));
        courses.add(new DisplayCourse(new Course("MATH 152", false)));
        courses.add(new DisplayCourse(new Course("MATH 232", false)));
        courses.add(new DisplayCourse(new Course("MATH 240", false)));

        courses.add(new DisplayCourse(new Course("CMPT 307", false)));
        courses.add(new DisplayCourse(new Course("CMPT 376W", false)));
        courses.add(new DisplayCourse(new Course("CMPT 300", false)));
        courses.add(new DisplayCourse(new Course("CMPT 354", false)));
        courses.add(new DisplayCourse(new Course("CMPT 371", false)));
        courses.add(new DisplayCourse(new Course("CMPT 372", false)));
        courses.add(new DisplayCourse(new Course("CMPT 431", false)));
        courses.add(new DisplayCourse(new Course("CMPT 433", false)));
        courses.add(new DisplayCourse(new Course("CMPT 454", false)));
        courses.add(new DisplayCourse(new Course("CMPT 471", false)));
        courses.add(new DisplayCourse(new Course("CMPT 373", false)));
        courses.add(new DisplayCourse(new Course("CMPT 473", false)));
        courses.add(new DisplayCourse(new Course("CMPT 379", false)));
        courses.add(new DisplayCourse(new Course("CMPT 383", false)));
        courses.add(new DisplayCourse(new Course("CMPT 384", false)));
        courses.add(new DisplayCourse(new Course("CMPT 474", false)));
        courses.add(new DisplayCourse(new Course("CMPT 477", false)));

        // Set prerequisites and SoSyPrerequisites for specific courses
        for (DisplayCourse course : courses) {
            switch (course.getName()) {
                case "CMPT 130" -> {
                    course.setPrerequisites("BC Math 12 (or equivalent, or any of MATH 100, 150, 151, 154, or 157)");
                    List<Course> soSyPrerequisites = new ArrayList<>();
                    soSyPrerequisites.add(new Course("MATH 150/MATH 151", true));
                    course.setSoSyPrerequisites(soSyPrerequisites);
                }
                case "CMPT 135" -> {
                    course.setPrerequisites("CMPT 130");
                    List<Course> soSyPrerequisites = new ArrayList<>();
                    soSyPrerequisites.add(new Course("CMPT 130", true));
                    course.setSoSyPrerequisites(soSyPrerequisites);
                }
                case "CMPT 210" -> {
                    course.setPrerequisites("MACM 101, MATH 152, CMPT 125 or CMPT 135, and (MATH 240 or MATH 232)");
                    List<Course> soSyPrerequisites = new ArrayList<>();
                    soSyPrerequisites.add(new Course("MACM 101", true));
                    soSyPrerequisites.add(new Course("MATH 152", true));
                    soSyPrerequisites.add(new Course("CMPT 135", true));
                    soSyPrerequisites.add(new Course("MATH 232/MATH 240", true));
                    course.setSoSyPrerequisites(soSyPrerequisites);
                }
                case "CMPT 213" -> {
                    course.setPrerequisites("CMPT 225");
                    List<Course> soSyPrerequisites = new ArrayList<>();
                    soSyPrerequisites.add(new Course("CMPT 225", true));
                    course.setSoSyPrerequisites(soSyPrerequisites);
                }
                case "CMPT 225" -> {
                    course.setPrerequisites("(MACM 101 and (CMPT 125, CMPT 129 or CMPT 135)) or (ENSC 251 and ENSC 252)");
                    List<Course> soSyPrerequisites = new ArrayList<>();
                    soSyPrerequisites.add(new Course("MACM 101", true));
                    soSyPrerequisites.add(new Course("CMPT 135", true));
                    course.setSoSyPrerequisites(soSyPrerequisites);
                }
                case "CMPT 276" -> {
                    course.setPrerequisites("One W course, CMPT 225, (MACM 101 or (MATH 151 or MATH 150))");
                    List<Course> soSyPrerequisites = new ArrayList<>();
                    soSyPrerequisites.add(new Course("CMPT 225", true));
                    soSyPrerequisites.add(new Course("MACM 101", true));
                    soSyPrerequisites.add(new Course("MATH 151", true));
                    soSyPrerequisites.add(new Course("MATH 150", true));
                    course.setSoSyPrerequisites(soSyPrerequisites);
                }
                case "CMPT 295" -> {
                    course.setPrerequisites("(MACM 101 and (CMPT 125 or CMPT 135))");
                    List<Course> soSyPrerequisites = new ArrayList<>();
                    soSyPrerequisites.add(new Course("MACM 101", true));
                    soSyPrerequisites.add(new Course("CMPT 135", true));
                    course.setSoSyPrerequisites(soSyPrerequisites);
                }
                case "MACM 101" -> {
                    course.setPrerequisites("BC Math 12 (or equivalent), or any of MATH 100, 150, 151, 154, 157");
                    List<Course> soSyPrerequisites = new ArrayList<>();
                    soSyPrerequisites.add(new Course("MATH 150", true));
                    soSyPrerequisites.add(new Course("MATH 151", true));
                    course.setSoSyPrerequisites(soSyPrerequisites);
                }
                case "MSE 110" -> {
                    course.setPrerequisites("");
                    List<Course> soSyPrerequisites = new ArrayList<>();
                    course.setSoSyPrerequisites(soSyPrerequisites);
                }
                case "STAT 271" -> {
                    course.setPrerequisites("CMPT 210");
                    List<Course> soSyPrerequisites = new ArrayList<>();
                    soSyPrerequisites.add(new Course("CMPT 210", true));
                    course.setSoSyPrerequisites(soSyPrerequisites);
                }
                case "MATH 150" -> {
                    course.setPrerequisites("Pre-Calculus 12 (or equivalent) with a grade of at least B+, or MATH 100 with a grade of at least B-");
                    List<Course> soSyPrerequisites = new ArrayList<>();
                    course.setSoSyPrerequisites(soSyPrerequisites);
                }
                case "MATH 151" -> {
                    course.setPrerequisites("Pre-Calculus 12 (or equivalent) with a grade of at least A, or MATH 100 with a grade of at least B");
                    List<Course> soSyPrerequisites = new ArrayList<>();
                    course.setSoSyPrerequisites(soSyPrerequisites);
                }
                case "MATH 152" -> {
                    course.setPrerequisites("MATH 150 or MATH 151, with a minimum grade of C-; or MATH 154 or MATH 157 with a grade of at least B");
                    List<Course> soSyPrerequisites = new ArrayList<>();
                    soSyPrerequisites.add(new Course("MATH 150", true));
                    soSyPrerequisites.add(new Course("MATH 151", true));
                    course.setSoSyPrerequisites(soSyPrerequisites);
                }
                case "MATH 232" -> {
                    course.setPrerequisites("MATH 150 or MATH 151 or MACM 101, with a minimum grade of C-; or MATH 154 or MATH 157 with a grade of at least B");
                    List<Course> soSyPrerequisites = new ArrayList<>();
                    soSyPrerequisites.add(new Course("MATH 150", true));
                    soSyPrerequisites.add(new Course("MATH 151", true));
                    soSyPrerequisites.add(new Course("MACM 101", true));
                    course.setSoSyPrerequisites(soSyPrerequisites);
                }
            }
        }
        return courses;
    }
}
