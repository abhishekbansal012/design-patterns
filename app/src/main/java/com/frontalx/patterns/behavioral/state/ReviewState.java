package com.frontalx.patterns.behavioral.state;

class ReviewState implements DocumentState {
    public void next(DocumentContext context) {
        context.setState(new ApprovedState());
    }

    public void prev(DocumentContext context) {
        context.setState(new DraftState());
    }

    public void printStatus() {
        System.out.println("Document is under Review.");
    }
}
