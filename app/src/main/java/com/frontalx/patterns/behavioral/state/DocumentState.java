package com.frontalx.patterns.behavioral.state;

public interface DocumentState {

    void next(DocumentContext context);
    void prev(DocumentContext context);
    void printStatus();

}
