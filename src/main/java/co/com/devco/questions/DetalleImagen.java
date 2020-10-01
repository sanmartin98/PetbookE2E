package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import static co.com.devco.userinterfaces.PetbookImageDetailPage.IMAGE_CONTAINER;

public class DetalleImagen implements Question<Boolean> {
    public DetalleImagen(){

    }

    public static DetalleImagen esVisible(){
        return new DetalleImagen();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return IMAGE_CONTAINER.resolveFor(actor).isVisible();
    }
}
