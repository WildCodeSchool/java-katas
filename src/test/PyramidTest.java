import org.junit.Assert;
import org.junit.Test;

public class PyramidTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void test0() throws Exception {
        String[] expected = {};
        Assert.assertArrayEquals(expected, Pyramid.draw(0));
    }

    @Test
    public void test1() throws Exception {
        String[] expected = {
                "*"
        };
        Assert.assertArrayEquals(expected, Pyramid.draw(1));
    }

    @Test
    public void test2() throws Exception {
        String[] expected = {
                " * ",
                "***"
        };
        Assert.assertArrayEquals(expected, Pyramid.draw(2));
    }

    @Test
    public void test5() throws Exception {
        String[] expected = {
                "    *    ",
                "   ***   ",
                "  *****  ",
                " ******* ",
                "*********",
        };
        Assert.assertArrayEquals(expected, Pyramid.draw(5));
    }
}
