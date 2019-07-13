package pl.sda.springbootvaadinb;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("hello")
public class HelloGui  extends VerticalLayout {

    public HelloGui() {

        TextField textField = new TextField();
       Button buttonOK = new Button(new Icon(VaadinIcon.ACADEMY_CAP));
        Label label = new Label();


        buttonOK.addClickListener(click->{
            label.setText("Hello " + textField.getValue());

            Image image1= new Image("https://imgur.com/gallery/GJr9SwK","brak dostępu");
            add(image1);
                });

        add(textField);
        add(buttonOK);
        add(label);


    }

}
