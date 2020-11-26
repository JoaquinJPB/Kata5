package Kata5.View;

import Kata5.Model.Mail;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MailListReaderBD {

    public static List<Mail> read() throws ClassNotFoundException, SQLException {
        List<Mail> mail = new ArrayList<>();
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:data/people.db");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT email FROM people");
        while (resultSet.next()){
            String email = resultSet.getString("email");
            Mail aux_email = new Mail(email);
            mail.add(aux_email);
        }
        return mail;
    }
    }
