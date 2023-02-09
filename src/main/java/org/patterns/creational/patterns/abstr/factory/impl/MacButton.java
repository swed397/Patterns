package org.patterns.creational.patterns.abstr.factory.impl;

import org.patterns.creational.patterns.abstr.factory.interfaces.Button;

public class MacButton implements Button {
    @Override
    public void createdText() {
        System.out.println("Mac button created");
    }
}
