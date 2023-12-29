package com.somnath.scrapper.core;

/**
 * This is class contains normal implementation for element attributes
 */
public class ElementAttributes {
    private final String content;
    private String className;
    private String id;
    private String autoFocus;
    private String autoCapitalize;
    private String contenteditable;
    private String contextMenu;
    private String dir;

    public String getContent() {
        return content;
    }

    public String getClassName() {
        return className;
    }

    public String getId() {
        return id;
    }

    public String getAutoFocus() {
        return autoFocus;
    }

    public String getAutoCapitalize() {
        return autoCapitalize;
    }

    public String getContenteditable() {
        return contenteditable;
    }

    public String getContextMenu() {
        return contextMenu;
    }

    public String getDir() {
        return dir;
    }

    public ElementAttributes(String content) {
        this.content = content;
        id = findAttribute("id");
        dir = findAttribute("dir");
        className = findAttribute("class");
        autoCapitalize = findAttribute("autocapitalize");
        autoFocus = findAttribute("autofocus");
        contextMenu = findAttribute("contextmenu");
        contenteditable = findAttribute("contenteditable");

    }

    public String findAttribute(String attr) {
        int rangeIndex = content.indexOf(attr);
        String range = content.substring(rangeIndex);
        int startIndex = range.indexOf("\"");
        int endIndex = startIndex+ 1 + range.substring(startIndex+1).indexOf("\"");
        if (startIndex != -1 && endIndex != -1) {
            return range.substring(startIndex, endIndex);
        }
        return "";
    }

}
