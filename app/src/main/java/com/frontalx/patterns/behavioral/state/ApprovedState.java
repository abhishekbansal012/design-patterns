package com.frontalx.patterns.behavioral.state;

class ApprovedState implements DocumentState {
    public void next(DocumentContext context) {
        System.out.println("Document is already approved.");
    }

    public void prev(DocumentContext context) {
        context.setState(new ReviewState());
    }

    public void printStatus() {
        System.out.println("Document is Approved.");
    }
}
