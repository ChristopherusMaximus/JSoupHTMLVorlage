package J.soup;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static Document doc;
    public static String url;

    public static void main(String[] args){
        url = "https://christopherusmaximus.github.io/JSoupHTMLVorlage/aufgabe.html";
        try {
            verbinde();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void verbinde() throws IOException {
        // Connection mit URL aufbauen
        Connection connection = Jsoup.connect(url);
        // HTML holen mit hilfe der Methode get()
        doc = connection.get();
        if(doc!=null) {
            bearbeiten();
            schreibeDatei();
        }

    }
    public static void bearbeiten(){
        //1.1) Titel anpassen

        //1.2) Überschrift anpassen
        Element ueberschrift = doc.getElementById("ueberschrift");

        //2) float:left float:right

    }

    public static void schreibeDatei() throws IOException {
        //3) Namen der Datei ändern
        File file = new File("./nichtFertig.html");

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write(doc.html());
        bw.close();
    }


}
