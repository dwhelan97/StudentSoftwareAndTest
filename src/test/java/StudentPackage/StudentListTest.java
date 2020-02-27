package StudentPackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentListTest {
    StudentList myStudentlist;
    Student student;

    private Object assertEquals;



    @Test
    void TestStudentList(){
        myStudentlist = new StudentList();
        student = new Student("Tom","G0033345673@gmit.ie");
        myStudentlist.add(student);

        assertEquals("Tom",myStudentlist.findByName("Tom").getName());
        if(myStudentlist.findByName("Tom").getName()=="Tom"){
            System.out.println(myStudentlist.findByName("Tom").getEmail());
        }

    }
}

