package com.somnath.scrapper.tags;

import com.somnath.scrapper.attributes.BodyAttributes;
import com.somnath.scrapper.core.Element;

public class Body extends Element {
    public Body(String content) {
        super("body", content);
        BodyAttributes attributes = new BodyAttributes(content);
        setAttributes(attributes);
    }

    @Override
    public BodyAttributes getAttributes() {
        return (BodyAttributes) super.getAttributes();
    }
}
