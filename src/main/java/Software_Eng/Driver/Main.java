package Software_Eng.Driver;

import Software_Eng.Assignment1.Student;
import Software_Eng.Assignment1.Module;
import Software_Eng.Assignment1.Course;
import org.joda.time.DateTime;
import java.util.ArrayList;

public class Main

{

    public static void main(String[] args)
    {

        //Initialise Students
        Student s1 = new Student("Jeff Goodson",22,new DateTime(1998,1,1,0,0),1);
        Student s2 = new Student("Amy Smith",21,new DateTime(1999,1,1,0,0),1);
        Student s3 = new Student("John Doe",24,new DateTime(1996,1,1,0,0),1);
        Student s4 = new Student("Mark King",25,new DateTime(1995,1,1,0,0),1);
        Student s5 = new Student("Martin Moran",31,new DateTime(1989,1,1,0,0),1);
        //Intialise Module
        Module m1 = new Module("Software Engineering","1234");
        Module m2 = new Module("Machine Learning","3000");
        Module m3 = new Module("System of Chip I","4");
        //Intialise Course
        DateTime StartDate = new DateTime(2020,1,1,0,0);
        DateTime EndDate = new DateTime(2020,12,1,0,0);
        Course c1 = new Course("Computer Science",StartDate,EndDate);
        Course c2 = new Course("Computer Engineering",StartDate,EndDate);

        //Add Studnets to Modules
        m1.addStudent(s1);m1.addStudent(s3);m1.addStudent(s4);
        m2.addStudent(s1);m2.addStudent(s4);m2.addStudent(s5);
        m3.addStudent(s4);m3.addStudent(s2);

        //Add modules to Courses
        c1.addModule(m1);c1.addModule(m2);
        c2.addModule(m1);c2.addModule(m2);c2.addModule(m3);

        //Add courses to ArrayList
        ArrayList<Course> Courses= new ArrayList<>();
        Courses.add(c1);
        Courses.add(c2);


        //Printout
        for(Course x:Courses){
            System.out.printf("Course name: %s\n",x);
            for(Module y:x.getModules()){

                System.out.printf("\tModule name: %s\n\t\tStudent List: \n",y);
                for(Student z:y.getStudents()){
                    System.out.printf("\t\t\t%s",z);
                }
            }
            System.out.print("\n");
        }

    }


}
