package com.frontalx.patterns.behavioral.state;

public class DocumentContext {

    private DocumentState state;

    public DocumentContext() {
        state = new DraftState(); // Default state
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void prevState() {
        state.prev(this);
    }

    public void printStatus() {
        state.printStatus();
    }

}
