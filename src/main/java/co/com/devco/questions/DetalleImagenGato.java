package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.userinterfaces.PetbookImageDetailPage.IMAGE_CONTAINER_GATO_3;

public class DetalleImagenGato implements Question<Boolean> {
    public DetalleImagenGato(){

    }

    public static DetalleImagenGato esVisible(){
        return new DetalleImagenGato();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return IMAGE_CONTAINER_GATO_3.resolveFor(actor).isVisible();
    }
}
