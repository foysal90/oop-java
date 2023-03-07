package abtraction;

import jdk.swing.interop.SwingInterOpUtils;

public class C implements  A,B {

    @Override
    public void call() {
        System.out.println("call me ");
    }
}
