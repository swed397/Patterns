package org.patterns.creational.patterns.abstr.factory.factory;

import org.patterns.creational.patterns.abstr.factory.impl.WindowsButton;
import org.patterns.creational.patterns.abstr.factory.impl.WindowsSelect;
import org.patterns.creational.patterns.abstr.factory.impl.WindowsTextField;
import org.patterns.creational.patterns.abstr.factory.interfaces.Button;
import org.patterns.creational.patterns.abstr.factory.interfaces.GuiFactory;
import org.patterns.creational.patterns.abstr.factory.interfaces.Select;
import org.patterns.creational.patterns.abstr.factory.interfaces.TextField;

public class WindowsGuiFactory implements GuiFactory {

    public WindowsGuiFactory() {
        System.out.println("Creating gui factory for Windows OS");
    }

    @Override
    public Button createButton() {

        System.out.println("Creating windows button");
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {

        System.out.println("Creating windows text field");
        return new WindowsTextField();
    }

    @Override
    public Select createSelect() {

        System.out.println("Creating windows select");
        return new WindowsSelect();
    }
}
