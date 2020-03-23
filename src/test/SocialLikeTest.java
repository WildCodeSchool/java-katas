import org.junit.Assert;
import org.junit.Test;

public class SocialLikeTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testFirst() throws Exception {
        Assert.assertEquals("Be the first to like this", SocialLike.like(new String[]{}));
    }

    @Test
    public void testOne() throws Exception {
        Assert.assertEquals("Cartman like this", SocialLike.like(new String[]{"Cartman"}));
    }

    @Test
    public void testTwo() throws Exception {
        Assert.assertEquals("Kenny and Cartman like this", SocialLike.like(new String[]{"Kenny", "Cartman"}));
    }

    @Test
    public void testMore() throws Exception {
        Assert.assertEquals("Stan and 3 other people like this", SocialLike.like(new String[]{"Stan", "Kyle", "Kenny", "Cartman"}));
    }
}
