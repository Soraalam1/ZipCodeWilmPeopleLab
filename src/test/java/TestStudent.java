import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        Student test = new Student(65L, "Name");
        boolean actual = test instanceof ILearner;

        Assert.assertEquals(true, actual);
    }
    @Test
    public void testInheritance(){
        Student test = new Student(65L, "Name");
        boolean actual = test instanceof Person;

        Assert.assertEquals(true, actual);
    }
    @Test
    public void testLearn(){
        Student test = new Student(65L, "Name");
        test.learn(45);
        test.learn(55);

        Double expected = 100.0;

        Assert.assertEquals(expected,test.getTotalStudyTime());
    }
}
