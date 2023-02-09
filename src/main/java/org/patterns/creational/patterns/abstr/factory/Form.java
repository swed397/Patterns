package org.patterns.creational.patterns.abstr.factory;

import org.patterns.creational.patterns.abstr.factory.interfaces.Button;
import org.patterns.creational.patterns.abstr.factory.interfaces.GuiFactory;
import org.patterns.creational.patterns.abstr.factory.interfaces.Select;
import org.patterns.creational.patterns.abstr.factory.interfaces.TextField;

public class Form {

    private final TextField textField;
    private final Select select;
    private final Button button;

    public Form(GuiFactory factory) {
        System.out.println("Gui factory successfully created!");

        this.textField = factory.createTextField();
        this.select = factory.createSelect();
        this.button = factory.createButton();

        use();
    }

    public void use() {
        button.createdText();
        select.createdText();
        textField.createdText();
    }
}
