package com.somnath.scrapper;

public class Document extends Element {
    private Body body;
    private Html html;
    private String content;
    public Document(String content) {
        super("document", content);
        this.content = content;
    }

    @Override
    public String innerHtml() {
        return this.content;
    }
}
