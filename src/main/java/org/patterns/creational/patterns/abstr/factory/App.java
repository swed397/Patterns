package org.patterns.creational.patterns.abstr.factory;

import org.patterns.creational.patterns.abstr.factory.factory.MacGuiFactory;
import org.patterns.creational.patterns.abstr.factory.factory.WindowsGuiFactory;
import org.patterns.creational.patterns.abstr.factory.interfaces.GuiFactory;

public class App {

    public static void main(String[] args) {

        GuiFactory guiFactory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.startsWith("win")) {
            guiFactory = new WindowsGuiFactory();
        } else if (osName.startsWith("mac")) {
            guiFactory = new MacGuiFactory();
        } else {
            throw new RuntimeException("Unknown OS!");
        }

        new Form(guiFactory);

        //Some logic ...
    }
}
