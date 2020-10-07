import org.junit.Assert;
import org.junit.Test;



public class TestYearUp {
    @Test
    public void testHostLecture(){
        YearUp yearup = new YearUp();

        yearup.hostLecture(1L,9);

        Double expected = 1.0;

        Student testing = yearup.getStudents().findByID(313L);

        Double actual = testing.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }
}
