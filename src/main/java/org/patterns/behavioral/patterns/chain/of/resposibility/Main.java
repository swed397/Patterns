package org.patterns.behavioral.patterns.chain.of.resposibility;

public class Main {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNext(emailNotifier);
        emailNotifier.setNext(smsNotifier);

        reportNotifier.notifyManager("All is ok", Priority.ROUTINE);
        reportNotifier.notifyManager("Something wrong", Priority.IMPORTANT);
        reportNotifier.notifyManager("All is bad", Priority.ASAP);
    }
}
