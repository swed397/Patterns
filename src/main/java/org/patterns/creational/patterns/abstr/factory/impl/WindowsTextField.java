package org.patterns.creational.patterns.abstr.factory.impl;

import org.patterns.creational.patterns.abstr.factory.interfaces.TextField;

public class WindowsTextField implements TextField {
    @Override
    public void createdText() {
        System.out.println("Windows text field created");
    }
}
