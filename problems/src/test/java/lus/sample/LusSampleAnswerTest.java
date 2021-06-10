package lus.sample;

import org.junit.Assert;
import org.junit.Test;

public class LusSampleAnswerTest {

    @Test
    public void test1() {
        LusSampleAnswer1 lusSampleAnswer = new LusSampleAnswer1();

        Assert.assertEquals(lusSampleAnswer.findLusLength("aaa", "bbb"), 3);
        Assert.assertEquals(lusSampleAnswer.findLusLength("aaa", "aaa"), -1);
        Assert.assertEquals(lusSampleAnswer.findLusLength("aba", "cdc"), 3);

        Assert.assertEquals(lusSampleAnswer.findLusLength("abaasdqfdasdfasdfadf", "cdcflmkvldsjnckjascd"), 20);
        Assert.assertEquals(lusSampleAnswer.findLusLength("abaasd", "aabaasd"), 7);

    }

    @Test
    public void test2() {
        LusSampleAnswer2 lusSampleAnswer = new LusSampleAnswer2();

        Assert.assertEquals(lusSampleAnswer.findLusLength("aaa", "bbb"), 3);
        Assert.assertEquals(lusSampleAnswer.findLusLength("aaa", "aaa"), -1);
        Assert.assertEquals(lusSampleAnswer.findLusLength("aba", "cdc"), 3);

        Assert.assertEquals(lusSampleAnswer.findLusLength("abaasdqfdasdfasdfadf", "cdcflmkvldsjnckjascd"), 20);
        Assert.assertEquals(lusSampleAnswer.findLusLength("abaasd", "aabaasd"), 7);

    }
}
