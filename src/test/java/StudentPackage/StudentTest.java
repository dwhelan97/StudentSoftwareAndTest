package StudentPackage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    Student myStudent;
    private Object assertEquals;

    @Test
    void AddStudent(){
        myStudent = new Student("Tom","G0033345673@gmit.ie");
        assertEquals("Tom",myStudent.getName());
        assertEquals("G0033345673@gmit.ie",myStudent.getEmail());
    }
    @Test
    void AddStudentNoName(){
        //myStudent = new Student("","G0033345673@gmit.ie");
        assertThrows(IllegalArgumentException.class,() ->new Student("","G0033345673@gmit.ie"));

    }

    @Test
    void AddStudentNoEmail(){
        //myStudent = new Student("Tom","G0033345673@gmit.ie");
        assertThrows(IllegalArgumentException.class,() ->new Student("Tom",""));
    }
}
