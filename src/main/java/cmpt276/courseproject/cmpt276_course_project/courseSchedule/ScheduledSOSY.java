package cmpt276.courseproject.cmpt276_course_project.courseSchedule;

import java.util.ArrayList;
import java.util.List;

// All scheduled SOSY Classes offered for next term with scheduledLectures specified.

public class ScheduledSOSY {
    public static List<ScheduledCourse> getAllScheduledCourses() {
        List<ScheduledCourse> scheduledCourses = new ArrayList<>();
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 120", "Dr. Gregory Baker", "BURNABY AQ3181"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("AQ3181", "Monday", 1430, 1620);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("AQ3181", "Wednesday", 1430, 1520);
            
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()),"CMPT 125", "Dr. Anne lavergne", "BURNABY B9201"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY B9201", "Monday", 1030, 1120);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY B9201", "Wednesday", 1030, 1120);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY B9201", "Friday", 1030, 1120);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()),"CMPT 105w", "Dr. Herbert Tsang", "BURNABY RCBIMAGTH"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY RCBIMAGTH", "Monday", 1430, 1620);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY RCBIMAGTH", "Wednesday", 1430, 1520);


            scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()),"CMPT 213", "Dr. Bobby Chan", "SURREY SRYE1002"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("SURREY SRYE1002", "Monday", 1030, 1220);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("SURREY SRYE1002", "Wednesday", 1030, 1120);
            

            scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()),"CMPT 225", "Dr. Anne Lavergne", "BURNABY AQ3182"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY AQ3182", "Monday", 1330, 1420);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY AQ3182", "Wednesday", 1330, 1420);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY AQ3182", "Friday", 1330, 1420);
            
            scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()),"CMPT 276", "Dr. Bobby Chan", "SURREY SRYE3016"));
           
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("SURREY SRYE3016", "Wednesday", 1330, 1420);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("SURREY SRYE3016", "Friday", 1230, 1420);
            

            scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()),"CMPT 295", "Dr. Gregory Baker", "BURNABY AQ3182"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY AQ3182", "Monday", 1230, 1320);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY AQ3182", "Wednesday", 1230, 1320);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY AQ3182", "Friday", 1230, 1320);
            

            scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()),"CMPT 300", "Dr. Tianzheng Wang", "BURNABY K9500"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY K9500", "Tuesday", 830, 1020);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY K9500", "Friday", 830, 920);
            
            scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()),"CMPT 307", "Dr. Thomas Shermer", "SURREY SRYE1002"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("SURREY SRYE1002", "Wednesday", 930, 1020);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("SURREY SRYE1002", "Friday", 830, 1020);

            scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()),"CMPT 354", "Dr. Zhengjie Miao", "BURNABY AQ3182"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY AQ3182", "Wednesday", 1530, 1650);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY AQ3182", "Friday", 1530, 1650);

            scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()),"CMPT 371", "Dr. Ouldooz Baghban Karimi", "SURREY SRYE2016"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("SURREY SRYE2016", "Tuesday", 1230, 1420);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("SURREY SRYE2016", "Friday", 1230, 1320);
            
            
            


        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()),"CMPT 376w", "Dr. John Edgar", "BURNABY AQ3182"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY AQ3182", "Monday", 930, 1020);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY AQ3182", "Wednesday", 930, 1020);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY AQ3182", "Friday", 930, 1020);



            scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()),"CMPT 454", "Dr. John Edgar", "BURNABY WMC3620"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY WMC3620", "Monday", 830, 920);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY WMC3620", "Wednesday", 830, 920);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY WMC3620", "Friday", 830, 920);

            scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()),"CMPT 471", "TBD", "BURNABY AQ3153"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY AQ3153", "Monday", 1530, 1650);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY AQ3153", "Wednesday", 1530, 1650);

            scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()),"CMPT 494", "TBD", "TBD"));
            

            scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()),"CMPT 495", "Dr. Ke Li", "TBD"));
            
            
            
            
            
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()),"MATH 150", "Dr. Mahsa Faizrahnemoon", "BURNABY BLU9660"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY BLU9660", "Monday", 1330, 1420);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY BLU9660", "Wednesday", 1330, 1420);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY BLU9660", "Friday", 1330, 1420);


        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()),"MATH 152", "Dr. Cedric Chauve,\n" +
                "Stephen Choi", "BURNABY B9201"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY B9201", "Monday", 830, 920);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY B9201", "Wednesday", 830, 920);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY B9201", "Friday", 830, 920);


            scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()),"MACM 101", "Dr. Steven Pearce", "BURNABY B9200"));
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY B9200", "Tuesday", 1030, 1120);
            scheduledCourses.get(scheduledCourses.size()-1).addLecture("BURNABY B9200", "Thursday", 930, 1120);
            
        return scheduledCourses;
    }
}
