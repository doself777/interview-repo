package tribonacci.sample;

import org.junit.Assert;
import org.junit.Test;

import tribonacci.sample.TribonacciSampleAnswer;

public class TribonacciSampleAnswerTest {

    @Test
    public void test1() {
        TribonacciSampleAnswer tribonacciSampleAnswer = new TribonacciSampleAnswer();

        Assert.assertEquals(tribonacciSampleAnswer.tribonacci(10), 149);
        Assert.assertEquals(tribonacciSampleAnswer.tribonacci(6), 13);
        Assert.assertEquals(tribonacciSampleAnswer.tribonacci(1), 1);


    }
}
