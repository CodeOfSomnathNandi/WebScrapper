package com.somnath.scrapper.tags;

import com.somnath.scrapper.attributes.BodyAttributes;
import com.somnath.scrapper.core.Element;

import java.util.ArrayList;

public class Body extends Element {

    private ArrayList<A_Tag> aTags;

    public ArrayList<A_Tag> getaTags() {
        return aTags;
    }

    public Body(String content) {
        super("body", content);
        BodyAttributes attributes = new BodyAttributes(content);
        setAttributes(attributes);
        aTags = new ArrayList<>();
        setATags(content);

    }

    @Override
    public BodyAttributes getAttributes() {
        return (BodyAttributes) super.getAttributes();
    }


    private void setATags(String contents) {
        int startIndex = contents.indexOf("<a");
        int endIndex = contents.indexOf("</a>");
        if (startIndex != -1 && endIndex != -1) {
            this.aTags.add(new A_Tag(contents.substring(startIndex, endIndex)));
            setATags(contents.substring(endIndex+1));
        }
    }
}
