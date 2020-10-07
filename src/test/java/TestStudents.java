import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestStudents {
    @Test
    public void testStudents(){
        Student dean = new Student(313L,"Dean");
        Student corey = new Student(918L,"Corey");
        Student yas = new Student(100L,"Yasmin");
        Student jadyn = new Student(309L,"Jadyn");
        Student asher = new Student(402L,"Asher");
        Student ryan = new Student(199L, "Ryan");
        Student dallas = new Student(43L, "Dallas");
        Student darren = new Student(505L, "Darren");
        Student ray = new Student(671L, "Raymundo");
        List<Person> expected = new ArrayList<Person>();
        expected.add(dean);
        expected.add(corey);
        expected.add(yas);
        expected.add(jadyn);
        expected.add(asher);
        expected.add(ryan);
        expected.add(dallas);
        expected.add(darren);
        expected.add(ray);

        Assert.assertEquals(expected.toString(), Students.getInstance().getPersonList().toString());
    }
}
