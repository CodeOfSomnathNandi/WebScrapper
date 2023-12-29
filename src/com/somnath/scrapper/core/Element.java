package com.somnath.scrapper.core;

import java.util.ArrayList;

public class Element {
    private ArrayList<Element> childs;
    private ElementAttributes attributes;
    private final String elementName;
    private final String content;

    public String getContentHtml() {
        return contentHtml;
    }

    public void setContentHtml() {
        int startRange = -1, endRange = -1;
        String tagStarting = String.format("%s", this.elementName);
        String tagEnding = String.format("/%s", this.elementName);
        int startIndex = content.indexOf(tagStarting) + tagStarting.length();
        int endIndex = content.indexOf(tagEnding);
        if (startIndex == -1 || endIndex == -1) {
            contentHtml = "";
            return;
        }
        int count = startIndex;
        boolean isNotMatchFound = true;
        while (isNotMatchFound) {
            if (content.charAt(count) == '<') {
                startRange = count;
                isNotMatchFound = false;
            }
            count--;
        }

        count = endIndex;
        isNotMatchFound = true;
        while (isNotMatchFound) {
            if (content.charAt(count) == '>') {
                endRange = count;
                isNotMatchFound = false;
            }
            count++;
        }

        contentHtml = content.substring(startIndex, endIndex);

    }

    private String contentHtml;


// all tags


    public Element(String elementName, String content) {
        this.elementName = elementName;
        this.content = content;
        setContentHtml();
    }

    public int matchFounder(int startIndex, String s) {
        String currentContent = content.substring(startIndex);
        int index = currentContent.indexOf(s);
        if (index == -1) {
            return -1;
        }
        return startIndex+index;
    }

    public String innerHtml() {
        String tagStarting = String.format("%s", this.elementName);
        String tagEnding = String.format("/%s", this.elementName);
        int startIndex = content.indexOf(tagStarting) + tagStarting.length();
        startIndex = matchFounder(startIndex, ">") +1;
        int endIndex = content.indexOf(tagEnding) -1;
        if (startIndex != -1 && endIndex != -1) {
            return content.substring(startIndex, endIndex);
        }
        return "";
    }
    public String innerText() {
        String html = innerHtml();
        if (!html.contains("</")) {
            return html;
        }
        return "";
    }

    public ArrayList<Element> getChilds() {
        return childs;
    }

    public void setChild(Element child) {
        this.childs.add(child);
    }

    public ElementAttributes getAttributes() {
        return attributes;
    }

    public void setChilds(ArrayList<Element> childs) {
        this.childs = childs;
    }

    public void setAttributes(ElementAttributes attributes) {
        this.attributes = attributes;
    }

}
