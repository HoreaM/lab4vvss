package validator;

import model.Laboratory;
import model.Student;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by horea on 04/04/2017.
 */
public class ValidatorTest {
    @Test
    public void validateStudent() throws Exception {
        Student studentValid = new Student("abcd1234", "Student Valid", 731);
        assertEquals(Validator.validateStudent(studentValid), true);

        Student studentInvalid = new Student("abcd", "Student Valid", 731);
        assertEquals(Validator.validateStudent(studentInvalid), false);

        Student studentInvalid2 = new Student("abcd1234", "Student Valid", 10000);
        assertEquals(Validator.validateStudent(studentInvalid2), false);

        Student studentInvalid3 = new Student("abcd1234", "123456", 731);
        assertEquals(Validator.validateStudent(studentInvalid3), false);

    }

//    @Test
//    public void validateLaboratory() throws Exception {
//        Laboratory laboratorValid = new Laboratory(5, "05/05/2017", 5, "abcd1234");
//        assertEquals(Validator.validateLaboratory(laboratorValid), true);
//
//        Laboratory laboratorInvalid = new Laboratory(0, "05/05/2017", 5, "abcd1234");
//        assertEquals(Validator.validateLaboratory(laboratorInvalid), false);
//
//        Laboratory laboratorInvalid2 = new Laboratory(5, "05/03/2017", 5, "abcd1234");
//        assertEquals(Validator.validateLaboratory(laboratorInvalid2), false);
//
//        Laboratory laboratorInvalid3 = new Laboratory(5, "05/05/2017", 20, "abcd1234");
//        assertEquals(Validator.validateLaboratory(laboratorInvalid3), false);
//
//        Laboratory laboratorInvalid4 = new Laboratory(5, "05/05/2017", 0, "abcd1234");
//        assertEquals(Validator.validateLaboratory(laboratorInvalid4), false);
//
//        Laboratory laboratorInvalid5 = new Laboratory(-1, "05/05/2017", 5, "abcd1234");
//        assertEquals(Validator.validateLaboratory(laboratorInvalid5), false);
//
//        Laboratory laboratorInvalid6 = new Laboratory(5, "05/05/2017", -1, "abcd1234");
//        assertEquals(Validator.validateLaboratory(laboratorInvalid6), false);
//
//        Laboratory laboratorInvalid7 = new Laboratory(5, "05/05/2017", 5, "abcd");
//        assertEquals(Validator.validateLaboratory(laboratorInvalid7), false);
//    }

    @Test
    public void validateGrade() throws Exception {
        float gradeValid = 5;
        assertEquals(Validator.validateGrade(gradeValid), true);

        float gradeInvalid = 5;
        assertEquals(Validator.validateGrade(gradeInvalid), false);

        float gradeInvalid2 = 0;
        assertEquals(Validator.validateGrade(gradeInvalid2), false);

        float gradeInvalid3 = 11;
        assertEquals(Validator.validateGrade(gradeInvalid3), false);
    }

}