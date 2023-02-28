package org.patterns.behavioral.patterns.template;

public class Main {

    public static void main(String[] args) {
        System.out.println("Draw Russian flag");
        AbstractThreeRowsFlag russianFlag = new RussianFlag();
        russianFlag.drawFlag();

        System.out.println("\nDraw Netherlands flag");
        AbstractThreeRowsFlag netherlandsFlag = new NetherlandsFlag();
        netherlandsFlag.drawFlag();
    }
}
