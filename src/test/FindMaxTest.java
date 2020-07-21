import org.junit.Assert;
import org.junit.Test;

public class FindMaxTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    /**
     * null
     */
    @Test
    public void testNullTree() {
        TreeNode tree = null;
        Assert.assertEquals(0, FindMax.max(tree));
    }

    /**
     *        5
    *       /   \
     *     3    17
     *    /    /  \
     *   1    11   21
     */
    @Test
    public void testTree() {
        TreeNode tree = new TreeNode(5,
                new TreeNode(3, new TreeNode(1, null, null), null),
                new TreeNode(17, new TreeNode(11, null, null), new TreeNode(21, null, null))
        );
        Assert.assertEquals(21, FindMax.max(tree));
    }
}
