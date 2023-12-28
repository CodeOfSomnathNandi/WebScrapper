package com.somnath.scrapper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WebScrapper {
    private final Document document;
    public WebScrapper(String url) throws URISyntaxException, IOException, InterruptedException {
        URI link = new URI(url);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(link)
                .GET()
                .build();
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> content = client.send(request, HttpResponse.BodyHandlers.ofString());
        client.close();
        document = new Document(content.body());
    }

    public Document getDocument() {
        return document;
    }
}
