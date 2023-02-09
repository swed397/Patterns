package org.patterns.creational.patterns.abstr.factory.impl;

import org.patterns.creational.patterns.abstr.factory.interfaces.Select;

public class WindowsSelect implements Select {
    @Override
    public void createdText() {
        System.out.println("Windows select created");
    }
}
