package com.jt.book;

import static org.mockito.Mockito.*;
import org.junit.Test;

/**
 * @author he
 * @since 2015/2/16
 */
public class TestMiniCar {

    @Test
    public void test01() throws Exception {
        Move move = mock(Move.class);
        MiniCar miniCar = new MiniCar(move);
        miniCar.drive();
        miniCar.drive();
        verify(move, times(2)).go();
    }
}
