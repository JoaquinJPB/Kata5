package Kata5.View;

import Kata5.Model.Histogram;
import Kata5.Model.Mail;

import java.util.List;

public class MailHistogramBuilder {

    public static Histogram<String> build(List<Mail> mailList) {
        Histogram<String> histogram = new Histogram();

        for (Mail mail : mailList) {
            histogram.increment(mail.getDomain());
        }

        return histogram;
    }

}
