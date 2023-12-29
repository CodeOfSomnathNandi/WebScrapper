package com.somnath.scrapper.attributes;

import com.somnath.scrapper.core.ElementAttributes;

public class AAttributes extends ElementAttributes {
    private final String href;
    private final String text;
    private final String download;
    private final String hrefLang;
    private final String ping;
    private final String referrerPolicy;
    private final String rel;
    private final String target;
    private final String type;

    public AAttributes(String content) {
        super(content);
        rel = findAttribute("rel");
        target = findAttribute("target");
        ping = findAttribute("ping");
        type = findAttribute("type");
        referrerPolicy = findAttribute("referrerpolicy");
        href = findAttribute("href");
        text = findAttribute("text");
        download = findAttribute("download");
        hrefLang = findAttribute("hreflang");
    }

    public String getHref() {
        return href;
    }

    public String getText() {
        return text;
    }

    public String getDownload() {
        return download;
    }

    public String getHrefLang() {
        return hrefLang;
    }

    public String getPing() {
        return ping;
    }

    public String getReferrerPolicy() {
        return referrerPolicy;
    }

    public String getRel() {
        return rel;
    }

    public String getTarget() {
        return target;
    }

    public String getType() {
        return type;
    }
}
