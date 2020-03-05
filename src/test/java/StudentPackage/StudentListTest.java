package StudentPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentListTest {
    StudentList myStudentlist;
    Student student;

    private Object assertEquals;

    @BeforeEach
    void setup(){
        student = new Student("Tom","YAYA@gmail.ie");
        myStudentlist = new StudentList();
    }

    @Test
    void testAddStudent(){
        myStudentlist.add(student);
        assertEquals(1,myStudentlist.getSize());
    }
    @Test
    void testFindByNameStudent(){
        myStudentlist.add(student);
        assertEquals(student.getName(),myStudentlist.findByName("Tom").getName());
    }


    @Disabled
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

