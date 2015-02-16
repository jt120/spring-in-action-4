package com.jt.book;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * @author he
 * @since 2015/2/16
 */
public class FakePrintStream extends PrintStream {

    static StringBuffer stringBuffer = new StringBuffer();

    public FakePrintStream() {
        super(new ByteArrayOutputStream());
    }

    @Override
    public void println(String s) {
        stringBuffer.append(s).append("\n");
    }

    public void clear() {
        System.out.println("now is " + stringBuffer.toString() + " and clear");
        stringBuffer = new StringBuffer();
    }

    public String getString() {
        return stringBuffer.toString();
    }
}
