package org.patterns.creational.patterns.abstr.factory.impl;

import org.patterns.creational.patterns.abstr.factory.interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void createdText() {
        System.out.println("Windows button created");
    }
}
