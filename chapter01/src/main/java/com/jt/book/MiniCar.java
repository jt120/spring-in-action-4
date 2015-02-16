package com.jt.book;

/**
 * @author he
 * @since 2015/2/16
 */
public class MiniCar implements Car {

    private Move move;

    public MiniCar(Move move) {
        this.move = move;
    }

    @Override
    public void drive() {
        move.go();
    }

    @Override
    public void back() {
        move.back();
    }


}
