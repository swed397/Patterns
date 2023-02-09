package org.patterns.creational.patterns.abstr.factory.interfaces;

public interface GuiFactory {
    Button createButton();
    TextField createTextField();
    Select createSelect();
}
