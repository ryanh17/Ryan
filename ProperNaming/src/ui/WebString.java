package ui;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class WebString {
    Document document;


    public WebString(String urlAsString) throws IOException {
        document = Jsoup.connect(urlAsString).get();
    }

    public String getHTML(){
        return document.toString();
    }

}
