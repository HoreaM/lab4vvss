package controller;

import model.Laboratory;
import model.Student;
import org.junit.Test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by horea on 04/04/2017.
 */
public class LaboratoriesControllerTest {
    Student student = new Student("abcd1234", "Student", 731);
    Laboratory laboratory = new Laboratory(5, "04/05/2017", 6, "abcd1234");
    LaboratoriesController controller = new LaboratoriesController("students.txt", "laboratories.txt");

    public LaboratoriesControllerTest() throws ParseException {
    }

    @Test
    public void saveStudent() throws Exception {
        assertEquals(controller.saveStudent(student), true);
    }

    @Test
    public void saveLaboratory() throws Exception {
        assertEquals(controller.saveLaboratory(laboratory), true);
    }

    @Test
    public void addGrade() throws Exception {
        float grade = 4;
        assertEquals(controller.addGrade("abcd1234", "5", grade), true);
    }

    @Test
    public void passedStudents() throws Exception {
        List<Student> passedStudents = new ArrayList();
        assertEquals(controller.passedStudents(), passedStudents);
    }

}