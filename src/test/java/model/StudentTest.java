package model;

import org.junit.Before;
import org.junit.Test;
import model.Student;

import static org.junit.Assert.*;

/**
 * Created by horea on 04/04/2017.
 */
public class StudentTest {
    private String regNumber = "abcd1234";
    private String name = "Nume Prenume";
    private int group = 731;

    private String newRegNumber = "qwer7890";
    private String newName = "Nume2 Prenume2";
    private int newGroup = 732;

    private Student student = new Student(regNumber, name, group);

    @Test
    public void getRegNumber() throws Exception {
        assertEquals(student.getRegNumber(), regNumber);
    }

    @Test
    public void setRegNumber() throws Exception {
        student.setRegNumber(newRegNumber);
        assertEquals(student.getRegNumber(), newRegNumber);

    }

    @Test
    public void getName() throws Exception {
        assertEquals(student.getName(), name);
    }

    @Test
    public void setName() throws Exception {
        student.setName(newName);
        assertEquals(student.getName(), newName);
    }

    @Test
    public void getGroup() throws Exception {
        assertEquals(student.getGroup(), group);
    }

    @Test
    public void setGroup() throws Exception {
        student.setGroup(newGroup);
        assertEquals(student.getGroup(), newGroup);
    }


    @Test
    public void equalsTest() throws Exception {
        Student student2 = new Student(regNumber, name, group);
        Student student3 = new Student(newRegNumber, newName, newGroup);

        assertEquals(student2.equals(student), true);

        assertEquals(student2.equals(student3), false);
    }
}