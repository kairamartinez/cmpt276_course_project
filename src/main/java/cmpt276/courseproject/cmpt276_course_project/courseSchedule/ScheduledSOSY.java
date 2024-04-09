package cmpt276.courseproject.cmpt276_course_project.courseSchedule;

import java.util.ArrayList;
import java.util.List;

// All scheduled SOSY classes offered for next term with scheduledLectures specified.

public class ScheduledSOSY {
    public static List<ScheduledCourse> getAllScheduledCourses() {
        List<ScheduledCourse> scheduledCourses = new ArrayList<>();
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 105W","Herbert Tsang","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1430,1620);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1430,1520);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 105W","Tara Immell","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",1730,1820);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Thursday",1730,1920);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 120","Anne Lavergne","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1230,1320);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1230,1320);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1230,1320);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 120","Frederick Popowich","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Thursday",1230,1420);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 120","Gregory Baker","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1030,1120);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1030,1120);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1030,1120);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 120","Victor Cheung","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Monday",1430,1520);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Thursday",1430,1620);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 125","Amir Daneshpajouh","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",1030,1120);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Thursday",930,1120);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 125","Anne Lavergne","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1130,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1130,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1130,1220);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 125","Janice Regan","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1330,1420);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 130","Brian Fraser","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Monday",1030,1120);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Wednesday",1030,1120);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Tuesday",1030,1120);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Friday",1030,1120);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 135","Toby Donaldson","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Monday",1230,1320);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Wednesday",1230,1320);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Friday",1230,1320);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 210","Sharan Vaswani","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",1030,1120);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Thursday",930,1120);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 213","Bobby Chan","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Monday",1030,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Wednesday",1030,1120);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 213","Brian Fraser","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Monday",930,1020);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Wednesday",930,1020);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Friday",930,1020);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 225","Anne Lavergne","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1330,1420);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 225","Anne Lavergne","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1730,1830);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1730,1830);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1730,1830);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 225","David Mitchell","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",1630,1720);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Thursday",1530,1720);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 225","Victor Cheung","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Tuesday",1630,1720);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Thursday",1530,1720);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 276","Amir Daneshpajouh","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1330,1420);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 276","Anne Lavergne","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1330,1420);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 276","Saba Alimadadi Jani","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",1030,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1030,1120);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 276","Bobby Chan","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Wednesday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Friday",1230,1420);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 295","Anne Lavergne","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",930,1020);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",930,1020);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",930,1020);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 295","Arrvindh Shriraman","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1230,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1230,1320);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 295","Gregory Baker","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1230,1320);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1230,1320);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1230,1320);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 300","Harinder Khangura","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1630,1920);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 300","Tianzheng Wang","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",830,1020);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",830,920);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 300","Harinder Khangura","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Tuesday",1430,1620);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Thursday",1430,1520);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 305","Alaa Alameldeen","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",830,1020);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Thursday",830,920);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 307","Kay C Wiese","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1430,1620);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1430,1520);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 307","Qianping Gu","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1330,1420);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 307","Ben Baral","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Tuesday",1730,1920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Thursday",1730,1820);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 307","Thomas Shermer","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Wednesday",930,1020);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Friday",830,1020);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 308","Valentine Kabanets","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1230,1420);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 310","Ahmadreza Nezami","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1530,1620);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1430,1620);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 310","Steve Pearce","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Thursday",1230,1420);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 353","Gregory Baker","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1430,1620);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1430,1520);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 353","Steven Bergner","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1630,1920);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 354","Evgenia Ternovska","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",1630,1720);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Thursday",1530,1720);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 354","Zhengjie Miao","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1530,1650);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1530,1650);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 361","Xue Bin Jason Peng","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",930,1020);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",830,1020);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 362","Xue Bin Jason Peng","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1630,1920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",1630,1920);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 363","Parmit Kaur Chilana","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1230,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1230,1320);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 363","Victor Cheung","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Monday",1230,1320);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Thursday",1230,1420);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 365","David Chou","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1630,1920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1230,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1230,1320);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 371","Balbir Gill","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Wednesday",1700,1950);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 371","Ouldooz Baghban Karimi","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Tuesday",1230,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Friday",1230,1320);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 372","Bobby Chan","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Wednesday",930,1020);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Friday",830,1020);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 373","William Sumner","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Monday",1430,1620);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Tuesday",1430,1620);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Wednesday",1430,1520);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 376W","John Edgar","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",930,1020);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",930,1020);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",930,1020);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 376W","Steve Pearce","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",1030,1120);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Thursday",930,1120);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 376W","Parsa Rajabi","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Tuesday",830,1020);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Thursday",830,920);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 379","Thomas Shermer","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",1230,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1230,1320);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 379","Thomas Shermer","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Tuesday",1230,1420);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 383","Yuepeng Wang","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1130,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1030,1220);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 384","Rob Cameron","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Tuesday",1130,1320);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Thursday",1130,1220);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 403","Tao Wang","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",1430,1620);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Thursday",1430,1520);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1230,1420);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 404","Andrei Bulatov","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1130,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1130,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1130,1220);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 405","Qianping Gu","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",930,1020);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",930,1020);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",930,1020);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 410","Mo Chen","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1530,1650);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1530,1650);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 411","James Delgrande","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1430,1520);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1430,1520);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1430,1520);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 412","Yasutaka Furukawa","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Thursday",1230,1420);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 413","Angel Chang","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1230,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1230,1320);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 417","Angel Chang","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1530,1620);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1430,1620);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 431","Alaa Alameldeen","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",1130,1320);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Thursday",1130,1220);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 433","Brian Fraser","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Monday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Wednesday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Friday",1330,1420);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 441","Kay C Wiese","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1430,1620);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",1430,1620);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1430,1520);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 450","Alaa Alameldeen","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",930,1020);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",830,1020);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 454","John Edgar","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",830,920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",830,920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",830,920);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 454","Ke Wang","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1630,1820);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1630,1720);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 461","Yagiz Aksoy","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1230,1420);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 464","Andrea Tagliasacchi","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Thursday",1430,1720);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 466","KangKang Yin","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",1030,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1030,1120);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 471","Jianliang Wu","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1530,1620);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1430,1620);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 471","Mohamed Hefeeda","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1530,1650);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1530,1650);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 473","William Sumner","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Monday",1030,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Tuesday",1030,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Wednesday",1030,1120);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 474","Ouldooz Baghban Karimi","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Monday",1030,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Wednesday",1030,1120);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "CMPT 477","Yuepeng Wang","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",1230,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1230,1320);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MACM 101","Brad Bart","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1130,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1030,1220);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MACM 101","Steve Pearce","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",1030,1120);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Thursday",930,1120);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MACM 101","Milan Tofiloski","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Tuesday",1430,1620);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Friday",1430,1520);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MATH 150","MacKenzie Carr","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",830,920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",830,920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",830,920);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MATH 150","Mahsa Faizrahnemoon","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1330,1420);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MATH 150","Natalia Kouzniak","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Monday",1130,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Wednesday",1130,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Friday",1130,1220);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MATH 151","Jamie Mulholland","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",830,920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",830,920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",830,920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",830,920);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MATH 151","Sophie Burrill","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",830,920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Tuesday",830,920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",830,920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",830,920);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MATH 151","Natalia Kouzniak","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Monday",930,1020);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Tuesday",930,1020);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Wednesday",930,1020);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Friday",930,1020);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MATH 152","Jamie Mulholland","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",830,920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",830,920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",830,920);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MATH 152","Lyn Ge","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",830,920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",830,920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",830,920);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MATH 152","Michael Monagan","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",830,920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",830,920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",830,920);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MATH 152","Stephen Choi","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",830,920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",830,920);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",830,920);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MATH 152","Vijaykumar Singh","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Monday",1130,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Wednesday",1130,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Friday",1130,1220);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MATH 232","Fatemeh Panjeh Ali Beik","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1130,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1130,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1130,1220);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MATH 232","Luis Goddyn","Burnaby"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Monday",1130,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Wednesday",1130,1220);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Burnaby","Friday",1130,1220);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MATH 232","Justin Chan","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Monday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Wednesday",1330,1420);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Friday",1330,1420);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MATH 232","Justin Chan","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Monday",1430,1520);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Wednesday",1430,1520);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Friday",1430,1520);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MSE 110","Amr Marzouk","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Tuesday",1130,1320);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Thursday",1130,1220);
        scheduledCourses.add(new ScheduledCourse(String.valueOf(scheduledCourses.size()), "MSE 110","Mohammad Narimani","Surrey"));
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Tuesday",830,1020);
        scheduledCourses.get(scheduledCourses.size()-1).addLecture("Surrey","Friday",830,920);
    return scheduledCourses;
    }
}
