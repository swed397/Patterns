package org.patterns.creational.patterns.abstr.factory.impl;

import org.patterns.creational.patterns.abstr.factory.interfaces.TextField;

public class MacTextField implements TextField {
    @Override
    public void createdText() {
        System.out.println("Mac text field created");
    }
}
