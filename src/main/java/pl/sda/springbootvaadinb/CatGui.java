package pl.sda.springbootvaadinb;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("cat")
public class CatGui extends VerticalLayout {

    @Autowired
    public CatGui(CatFactClient catFactClient, CatGifClient catGifClient, CatImageClient catImageClient) {

        CatFact catFact = catFactClient.getCatFactFormApi();
        String catGif = catGifClient.getCatGifFormApi();
        String catImage = catImageClient.getCatImageFormApi();

        Label labelCat = new Label(catFactClient.getCatFactFormApi().getText());
        add(labelCat);

        Label labelEmpty = new Label("Fajny Gif");
        add(labelEmpty);

        Image imageCat = new Image(catGif,"brak dostępu");
        add(imageCat);

        Label labelEmpty2 = new Label("Fajny obrazek");
        add(labelEmpty2);

        Image imageCatImage = new Image(catImage,"nie ma");
        add(imageCatImage);


}
}
