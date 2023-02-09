package org.patterns.creational.patterns.abstr.factory.impl;

import org.patterns.creational.patterns.abstr.factory.interfaces.Select;

public class MacSelect implements Select {
    @Override
    public void createdText() {
        System.out.println("Mac select created");
    }
}
