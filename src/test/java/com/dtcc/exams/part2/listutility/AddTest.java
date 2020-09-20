package com.dtcc.exams.part2.listutility;

import com.dtcc.exams.part2.ListUtility;
import org.junit.Assert;
import org.junit.Test;

public class AddTest {
    @Test
    public void test1() {
        this.test(1);
    }

    @Test
    public void test2() {
        this.test(2);
    }

    @Test
    public void test3() {
        this.test(3);
    }

    @Test
    public void test4() {
        this.test(null);
    }


    private void test(Integer valueToAdd){
        // given
        ListUtility utility = new ListUtility();
        Assert.assertFalse(utility.contains(valueToAdd));

        // when
        utility.add(valueToAdd);

        // then
        Assert.assertTrue(utility.contains(valueToAdd));
    }

}
