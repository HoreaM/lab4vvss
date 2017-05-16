package model;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by horea on 04/04/2017.
 */
public class LaboratoryTest {
    private int number = 5;
    private String dateString = "04/05/2017";
    private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    private Date date = format.parse(dateString);
    private int problemNumber = 6;
    private String studentRegNumber = "abcd1234";
    private float grade = 5;

    private int newNumber = 6;
    private String newDateString = "04/06/2017";
    private SimpleDateFormat newFormat = new SimpleDateFormat("dd/MM/yyyy");
    private Date newDate = newFormat.parse(newDateString);
    private int newProblemNumber = 7;
    private String newStudentRegNumber = "qwer7890";

    Laboratory laboratory = new Laboratory(number, dateString, problemNumber, studentRegNumber);

    Laboratory laboratoryGrade = new Laboratory(number, dateString, problemNumber, grade, studentRegNumber);

    public LaboratoryTest() throws ParseException {
    }

    @Test
    public void getNumber() throws Exception {
        assertEquals(laboratory.getNumber(), number);
    }

    @Test
    public void setNumber() throws Exception {
        laboratory.setNumber(newNumber);
        assertEquals(laboratory.getNumber(), newNumber);
    }

    @Test
    public void getDate() throws Exception {
        assertEquals(laboratory.getDate(), date);

    }

    @Test
    public void setDate() throws Exception {
        laboratory.setDate(newDate);
        assertEquals(laboratory.getDate(), newDate);
    }

    @Test
    public void getProblemNumber() throws Exception {
        assertEquals(laboratory.getProblemNumber(), problemNumber);
    }

    @Test
    public void setProblemNumber() throws Exception {
        laboratory.setProblemNumber(newProblemNumber);
        assertEquals(laboratory.getProblemNumber(), newProblemNumber);
    }

    @Test
    public void getStudentRegNumber() throws Exception {
        assertEquals(laboratory.getStudentRegNumber(), studentRegNumber);
    }

    @Test
    public void setStudentRegNumber() throws Exception {
        laboratory.setStudentRegNumber(newStudentRegNumber);
        assertEquals(laboratory.getStudentRegNumber(), newStudentRegNumber);
    }


}