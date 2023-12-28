package com.somnath.scrapper;

public class Document extends Element {
    private final Body body;
    private final Html html;
    private final String content;
    public Document(String content) {
        super("document", content);
        body = new Body(content);
        html = new Html(content);
        this.content = content;
    }

    @Override
    public String innerHtml() {
        return this.content;
    }


    public Body getBody() {
        return body;
    }


    public Html getHtml() {
        return html;
    }
}
