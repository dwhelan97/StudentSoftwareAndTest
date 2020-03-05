package StudentPackage;

import java.security.InvalidParameterException;
import java.util.ArrayList;

public class StudentList {

    ArrayList<Student> StudentNames = new ArrayList<Student>();
    public StudentList(){
        StudentNames = new ArrayList<Student>();
    }

    public Student findByName(String name) {
        for (Student student : StudentNames)
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        return null;
    }
    public void add(Student newStudent){
        for(Student student:StudentNames)
            if(newStudent.getName()==newStudent.getName())
            {
                throw new InvalidParameterException("Student With this Id is already added to the list");
            }
        StudentNames.add(newStudent);
    }
    public int getSize(){
        StudentNames.size();
        return StudentNames.size();
    }
}



