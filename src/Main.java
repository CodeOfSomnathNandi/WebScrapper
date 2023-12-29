import com.somnath.scrapper.WebScrapper;
import com.somnath.scrapper.tags.A_Tag;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        String url = "https://en.wikipedia.org/wiki/Java_(programming_language)";
        WebScrapper scrapper = new WebScrapper(url);
//        System.out.println(scrapper.getDocument().getHtml().innerHtml());
        var body = scrapper.getDocument().getBody();
        for (A_Tag tag : body.getaTags()) {
            System.out.println(tag.getAttributes().getHref());
        }
    }
}