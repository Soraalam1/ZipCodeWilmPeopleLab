import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestInstructors {
    @Test
    public void testInstructors(){
        List<Person> expected = new ArrayList<Person>();
        expected.add(new Instructor(1L, "Mikaila"));
        expected.add(new Instructor(2L, "Chad"));
        expected.add(new Instructor(3L, "Torrie"));
        expected.add(new Instructor(4L, "Colleen"));

        Assert.assertEquals(expected.toString(), Instructors.getInstance().getPersonList().toString());
    }
}
