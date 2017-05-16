package repository;

import model.Laboratory;
import model.Student;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.*;

/**
 * Created by horea on 04/04/2017.
 */
public class FileDataPersistenceTest {
    private String file = "students.txt";
    private FileDataPersistence filePersistence = new FileDataPersistence(file);
    Student student = new Student("abcd1234", "Student", 731);
    Laboratory laboratory = new Laboratory(5, "04/05/2017", 6, "abcd1234");
    private FileDataPersistence studentPersistence = new FileDataPersistence("students.txt");
    private FileDataPersistence laboratoryPersistence = new FileDataPersistence("laboratories.txt");
    private FileDataPersistence testFile = new FileDataPersistence("testFile.txt");

    private String newFile = "laboratories.txt";

    public FileDataPersistenceTest() throws ParseException {
    }

    @Test
    public void getFile() throws Exception {
        assertEquals(filePersistence.getFile(), file);
    }

    @Test
    public void setFile() throws Exception {
        filePersistence.setFile(newFile);
        assertEquals(filePersistence.getFile(), newFile);
    }

    @Test
    public void saveStudent() throws Exception {
        assertEquals(testFile.saveStudent(student), true);
    }

    @Test
    public void saveLaboratory() throws Exception {
        assertEquals(testFile.saveLaboratory(laboratory), true);
    }

    @Test
    public void addGrade() throws Exception {
        float grade = 3;
        assertEquals(laboratoryPersistence.addGrade("abcd1234", "5", grade), true);
    }

    @Test
    public void getLaboratoryMap() throws Exception {
    }

    @Test
    public void getStudentsList() throws Exception {
    }

}