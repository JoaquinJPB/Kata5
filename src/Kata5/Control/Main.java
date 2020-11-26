package Kata5.Control;

import Kata5.Model.Histogram;
import Kata5.Model.Mail;
import Kata5.View.HistogramDisplay;
import Kata5.View.MailHistogramBuilder;
import Kata5.View.MailListReaderBD;

import java.sql.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        List<Mail> mailList = MailListReaderBD.read();
        Histogram<String> mailHistogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histo = new HistogramDisplay("Histogram", mailHistogram);
        histo.execute();
    }
}
