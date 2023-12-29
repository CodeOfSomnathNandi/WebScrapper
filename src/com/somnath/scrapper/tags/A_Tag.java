package com.somnath.scrapper.tags;

import com.somnath.scrapper.attributes.AAttributes;
import com.somnath.scrapper.core.Element;
import com.somnath.scrapper.core.ElementAttributes;

public class A_Tag extends Element {

    public A_Tag(String content) {
        super("a", content);
        AAttributes attributes = new AAttributes(content);
        setAttributes(attributes);
    }

    @Override
    public AAttributes getAttributes() {
        return (AAttributes) super.getAttributes();
    }
}
