package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.userinterfaces.PetbookImageDetailPage.IMAGE_CONTAINER_PERRO;

public class DetalleImagenPerro implements Question<Boolean> {
    public DetalleImagenPerro(){

    }

    public static DetalleImagenPerro esVisible(){
        return new DetalleImagenPerro();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return IMAGE_CONTAINER_PERRO.resolveFor(actor).isVisible();
    }
}
