package com.example;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class SecondPage extends BasePage {

    private static final long serialVersionUID = 1L;

    public SecondPage(final PageParameters parameters, final String value){
        super(null);
//        System.out.println("val:"+value);
        add(new Label("valuepassed",value));
    }
}
