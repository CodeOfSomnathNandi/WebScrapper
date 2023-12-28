package com.somnath.scrapper;

import java.util.ArrayList;

public class Element {
    private ArrayList<Element> childs;
    private ArrayList<ElementAttributes> attributes;
    private String elementName;
    private String content;
    public Element(String elementName, String content) {
        this.elementName = elementName;
        this.content = content;
    }

    public String innerHtml() {
        String tagStarting = String.format("<%s>", this.elementName);
        String tagEnding = String.format("</%s>", this.elementName);
        int startIndex = content.indexOf(tagStarting) + tagStarting.length();
        int endIndex = content.indexOf(tagEnding);
        if (startIndex != -1 && endIndex != -1) {
            return content.substring(startIndex, endIndex);
        }
        return "";
    }
    public String innerText() {
        return "";
    }

    public ArrayList<Element> getChilds() {
        return childs;
    }

    public void setChild(Element child) {
        this.childs.add(child);
    }

    public ArrayList<ElementAttributes> getAttributes() {
        return attributes;
    }

    public void setAttribute(String key, String value) {

    }

}
