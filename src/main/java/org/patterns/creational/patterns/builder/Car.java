package org.patterns.creational.patterns.builder;

public class Car {

    private String body;
    private String wheels;
    private String paint;

    public Car() {
    }

    public Car(String body, String wheels, String paint) {
        this.body = body;
        this.wheels = wheels;
        this.paint = paint;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getPaint() {
        return paint;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }
}
