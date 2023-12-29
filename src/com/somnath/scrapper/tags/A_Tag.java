package com.somnath.scrapper.tags;

import com.somnath.scrapper.attributes.AAttributes;
import com.somnath.scrapper.core.Element;

public class A_Tag extends Element {

    public A_Tag(String content) {
        super("a", content);
        AAttributes attributes = new AAttributes(content);
        setAttributes(attributes);
    }

}
