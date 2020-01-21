import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CensorshipTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testTacos() throws Exception {

        List<String> test = new ArrayList<>();
        test.add("J'aime manger des tacos de bon matin");
        test.add("Le skate et le roller c'est un peu pareil");
        test.add("Notre menu propose des tacos au boeuf");

        List<String> result = new ArrayList<>();
        result.add("J'aime manger des t**** de bon matin");
        result.add("Notre menu propose des t**** au boeuf");
        Assert.assertEquals(result, Censorship.censor(test, "tacos"));
    }
}
