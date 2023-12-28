import com.somnath.scrapper.Document;
import com.somnath.scrapper.WebScrapper;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        String url = "https://en.wikipedia.org/wiki/Java_(programming_language)";
        WebScrapper scrapper = new WebScrapper(url);
//        System.out.println(scrapper.getDocument().getHtml().innerHtml());
        System.out.println(scrapper.getDocument().getBody().innerHtml());
    }
}