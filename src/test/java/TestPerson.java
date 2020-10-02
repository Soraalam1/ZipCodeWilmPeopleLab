import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void constructorTest(){
        Person test = new Person(4256L, "Name");

        String expectedName = "Name";
        long expectedID = 4256L;

        Assert.assertEquals(expectedID,test.getId());
        Assert.assertEquals(expectedName,test.getName());

    }
    @Test
    public void setNameTest(){
        Person test = new Person(4256L, "Name");
        String expectedName = "Dean";

        test.setName(expectedName);

        Assert.assertEquals(expectedName, test.getName());
    }
}
