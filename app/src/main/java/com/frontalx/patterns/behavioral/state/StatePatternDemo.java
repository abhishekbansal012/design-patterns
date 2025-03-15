package com.frontalx.patterns.behavioral.state;

public class StatePatternDemo {

    public static void main(String[] args) {
        DocumentContext doc = new DocumentContext();
        doc.printStatus();

        doc.nextState();
        doc.printStatus();

        doc.nextState();
        doc.printStatus();

        doc.prevState();
        doc.printStatus();
    }

}
