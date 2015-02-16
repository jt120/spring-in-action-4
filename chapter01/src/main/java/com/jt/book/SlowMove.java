package com.jt.book;

import java.io.PrintStream;

/**
 * @author he
 * @since 2015/2/16
 */
public class SlowMove implements Move {

    PrintStream printStream;

    public SlowMove(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void go() {
        printStream.println("go ahead!");
    }

    @Override
    public void back() {
        printStream.println("go back!");
    }
}
