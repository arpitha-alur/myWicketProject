package com.example;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HomePage extends BasePage{

    private static final long serialVersionUID = 1L;

    String inputValue;

    public HomePage(final PageParameters parameters){
        super(null);
        this.inputValue="test";

        Form<String> form = new Form<String>("form"){
            public final void onSubmit(){
                setResponsePage(new SecondPage(null,inputValue));
            }
        };

        add(form);
        form.add(new TextField<String>("input",new PropertyModel<>(this,"inputValue")));
    }
}
