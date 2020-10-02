import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd(){
        People test = new People();
        Person test1 = new Person(5L, "Dean");
        test.add(test1);

        Assert.assertEquals(true, test.contains(test1));
    }
    @Test
    public void testRemove(){
        People test = new People();
        Person test1 = new Person(5L, "Dean");
        test.add(test1);
        test.remove(test1);

        Assert.assertEquals(false, test.contains(test1));
    }
    @Test
    public void testFindByID(){
        People test = new People();
        Person test1 = new Person(5L, "Dean");
        test.add(test1);

        Assert.assertEquals(test1, test.findByID(5L));
    }
}
