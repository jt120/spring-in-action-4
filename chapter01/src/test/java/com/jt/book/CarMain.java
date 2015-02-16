package com.jt.book;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author he
 * @since 2015/2/16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CarConfig.class})
public class CarMain {

    @Autowired
    Car car;

    @Autowired
    FakePrintStream printStream;

    @After
    public void clear() {
        printStream.clear();
    }

    @Test
    public void test01() throws Exception {
        car.drive();
        Assert.assertEquals("not ok","go ahead!\n", printStream.getString());
    }

    @Test
    public void test02() throws Exception {
        car.back();
        Assert.assertEquals("not ok", "go back!\n",printStream.getString());
    }
}
