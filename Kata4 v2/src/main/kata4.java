package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import view.HistogramDisplay;
import model.Histogram;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Mail;
import view.MailListReader;

public class kata4 {

    public static void main(String[] args) {
        
        kata4 histograma = new kata4();
        try {
            histograma.execute();
        } catch (IOException ex) {
            Logger.getLogger(kata4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private List<Mail> list;
    private Histogram<String> histogram;
    
    private void execute() throws IOException {
        input();
        process();
        output();
    }
    
    private void input() throws IOException {
        list = MailListReader.read("email.txt");
    }
    
    private void process() throws IOException {
        histogram = view.MailHistogramBuilder.build(list);
    }
    
    private void output() throws IOException {
        HistogramDisplay histo = new HistogramDisplay("HISTOGRAM", histogram);
        histo.execute();
    }
}


