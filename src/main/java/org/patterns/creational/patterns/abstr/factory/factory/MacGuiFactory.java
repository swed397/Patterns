package org.patterns.creational.patterns.abstr.factory.factory;

import org.patterns.creational.patterns.abstr.factory.impl.MacButton;
import org.patterns.creational.patterns.abstr.factory.impl.MacSelect;
import org.patterns.creational.patterns.abstr.factory.impl.MacTextField;
import org.patterns.creational.patterns.abstr.factory.interfaces.Button;
import org.patterns.creational.patterns.abstr.factory.interfaces.GuiFactory;
import org.patterns.creational.patterns.abstr.factory.interfaces.Select;
import org.patterns.creational.patterns.abstr.factory.interfaces.TextField;

public class MacGuiFactory implements GuiFactory {

    public MacGuiFactory() {
        System.out.println("Creating gui factory for Mac OS");
    }

    @Override
    public Button createButton() {

        System.out.println("Creating mac button");
        return new MacButton();
    }

    @Override
    public TextField createTextField() {

        System.out.println("Creating mac text field");
        return new MacTextField();
    }

    @Override
    public Select createSelect() {

        System.out.println("Creating mac select");
        return new MacSelect();
    }
}
