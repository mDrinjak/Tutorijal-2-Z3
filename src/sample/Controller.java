package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class Controller {
    public TextArea ulaz;
    public TextArea izlaz;
    public void VelikaSlova(ActionEvent actionEvent) {
        String recenica=ulaz.getText();
        String [] rijeci = recenica.split(" ", 3);
        int max=0;
        String najduza="";
        for (String rijec : rijeci) {
            if (rijec.length() > max) {
                max = rijec.length();
                najduza = rijec;
            }
        }
        String rez="";
        for(String rijec : rijeci){
            if(rijec!=najduza)
                rez+=rijec+" ";
            else
                rez+=(najduza.toUpperCase());
        }
        izlaz.setText(rez);

    }
}
