package main;

import java.io.FileNotFoundException;
import view.HistogramDisplay;
import model.Histogram;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Mail;
import view.MailListReader;

public class kata4 {

    public static void main(String[] args) {
        List<Mail> list;
        try {
            list = MailListReader.read("email.txt");
            Histogram<String> histogram = view.MailHistogramBuilder.build(list);
            HistogramDisplay histo = new HistogramDisplay("HISTOGRAM", histogram);
            histo.execute();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception. File not found.");
        }
    }
}