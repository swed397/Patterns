package org.patterns.behavioral.patterns.chain.of.resposibility;

public abstract class Notifier {

    private int priority;
    private  Notifier next;


    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNext(Notifier notifier) {
        this.next = notifier;
    }

    public void notifyManager(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (next != null) {
            next.notifyManager(message, level);
        }
    }

    public abstract void write(String message);
}
