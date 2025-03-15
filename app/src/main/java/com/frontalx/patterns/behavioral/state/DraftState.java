package com.frontalx.patterns.behavioral.state;

public class DraftState implements DocumentState {

    public void next(DocumentContext context) {
        context.setState(new ReviewState());
    }

    public void prev(DocumentContext context) {
        System.out.println("Draft is the initial state.");
    }

    public void printStatus() {
        System.out.println("Document is in Draft state.");
    }

}
