import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor test = new Instructor(45L, "Name");

        boolean actual = false;

        if(test instanceof ITeacher){
            actual = true;
        }
        Assert.assertEquals(true, actual);
    }
    @Test
    public void testInheritance(){
        Instructor test = new Instructor(45L, "Name");

        boolean actual = false;

        if(test instanceof Person){
            actual = true;
        }
        Assert.assertEquals(true, actual);
    }
    @Test
    public void testTeach(){
        Instructor test = new Instructor(45L, "Name");
        Student test1 = new Student(20L,"Dean");

        test.teach(test1, 5);

        Double expected = 5.0;

        Assert.assertEquals(expected, test1.getTotalStudyTime());
    }
    @Test
    public void testLecture(){
        Instructor test = new Instructor(45L, "Name");
        Student test1 = new Student(20L,"Dean");
        Student test2 = new Student(22L,"two");
        Student test3 = new Student(21L,"three");

        Student[] students = {test1,test2,test3};

        Double expected = 10.0;

        test.lecture(students, 30);

        Assert.assertEquals(expected, test1.getTotalStudyTime());
        Assert.assertEquals(expected, test2.getTotalStudyTime());
        Assert.assertEquals(expected, test3.getTotalStudyTime());

    }
}
