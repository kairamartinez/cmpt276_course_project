package cmpt276.courseproject.cmpt276_course_project.courses;

import java.util.List; 
import java.util.ArrayList; 
import java.util.Scanner; 

public class SosyCourses {
    public static List<String> generateSosyList() {
        List<String> SosyCourses = new ArrayList<>(); 
        SosyCourses.add("101 CMPT!Introduction to Computers!2!(100 CMPT,)!(Spring 2024*Location 1*Prof 1*(101 CMPT#Spring 2024#Monday#900#1000%101 CMPT#Spring 2024#Wednesday#900#1000%),Spring 2024*Location 2*Prof 2*(101 CMPT#Spring 2024#Monday#900#1200%101 CMPT#Spring 2024#Friday#900#1200%),)!True");
        SosyCourses.add("201 CMPT!Introduction to Computers 2!2!(101 CMPT, 100 CMPT,)!(Spring 2024*Location 1*Prof 1*(201 CMPT#Spring 2024#Thursday#900#1000%201 CMPT#Spring 2024#Wednesday#900#1000%),Spring 2024*Location 2*Prof 2*(201 CMPT#Spring 2024#Thursday#900#1200%201 CMPT#Spring 2024#Friday#900#1200%),)!False");
        return SosyCourses;
    }

    public static void generateCourseListString(){
        List<String> courses = new ArrayList<>();
        Scanner inputScanner = new Scanner(System.in);
        String courseString = "";
        
        while (true) {
            // Break Case 
            System.out.print("Enter Course Identification: ");
            String courseInput = inputScanner.nextLine(); 
            if (courseInput.isEmpty()) break;
            courseString = courseString + courseInput.trim() + "!";

            
            // Other Course Information
            System.out.print("Enter Course Name: ");
            courseString = courseString + inputScanner.nextLine().trim() + "!";
            System.out.print("Enter Course Units: ");
            courseString = courseString + inputScanner.nextLine().trim() + "!";

            // Pre Reqs
            String preReqsString = "(";
            while (true) {
                System.out.println();
                System.out.println("Specify PreReq Offerings");

                // Break Case
                System.out.print("Enter PreReq Identification: ");
                String preReqInput = inputScanner.nextLine();
                if (preReqInput.isEmpty()) break;
                preReqsString = preReqsString + preReqInput.trim() + ",";
            }
            courseString = courseString + preReqsString + ")!";

            // Offerings
            List<String> courseOfferings = new ArrayList<>();
            String offeringString = "";
            while (true) {
                System.out.println();
                System.out.println("Specify Course Offerings");
                // Break Case
                System.out.print("Enter Term: ");
                String offeringInput = inputScanner.nextLine();
                if (offeringInput.isEmpty()) break;
                offeringString = offeringString + offeringInput.trim() + "*";

                // Other information
                System.out.print("Enter Course Location: ");
                offeringString = offeringString + inputScanner.nextLine().trim()+ "*";
                System.out.print("Enter Course Prof: ");
                offeringString = offeringString + inputScanner.nextLine().trim() + "*";

                // Lectures
                List<String> lectures = new ArrayList<>();
                String lectureString = "";
                while (true) {
                    System.out.println();
                    System.out.println("Specify Course Lectures");

                    // Break Case
                    System.out.print("Enter Course: ");
                    String lectureInput = inputScanner.nextLine();
                    if (lectureInput.isEmpty()) break;
                    lectureString = lectureString + lectureInput.trim() + "#";

                    // Other information
                    System.out.print("Enter Term: ");
                    lectureString = lectureString + inputScanner.nextLine().trim()+ "#";
                    System.out.print("Enter Day: ");
                    lectureString = lectureString + inputScanner.nextLine().trim() + "#";
                    System.out.print("Enter Start Time: ");
                    lectureString = lectureString + inputScanner.nextLine().trim() + "#";
                    System.out.print("Enter End Time: ");
                    lectureString = lectureString + inputScanner.nextLine().trim();
                    lectures.add(lectureString);
                    lectureString = "";
                }
                String lecturesString = "(";
                for (String string : lectures) {
                    lecturesString = lecturesString + string + "%";
                }
                offeringString = offeringString + lecturesString + ")";
                courseOfferings.add(offeringString);
                offeringString = "";
                System.out.println(offeringString);
            }

            String offeringsString = "(";
            for (String string : courseOfferings) {
                offeringsString = offeringsString + string + ",";
            }
            courseString = courseString + offeringsString + ")!";

            // finished
            System.out.print("Completed Course: ");
            courseString = courseString + inputScanner.nextLine().trim();
            courses.add(courseString);
            courseString = "";
            System.out.println();
        }
        for (String course : courses) {
            System.out.print(course);
        }
    }
}

