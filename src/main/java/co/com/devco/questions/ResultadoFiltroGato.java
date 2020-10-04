package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.userinterfaces.PetbookHomePage.IMAGEN_PERRO_POS_1;

public class ResultadoFiltroGato implements Question<Boolean> {
    public ResultadoFiltroGato(){

    }

    public static ResultadoFiltroGato noHayPerros(){
        return new ResultadoFiltroGato();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return !IMAGEN_PERRO_POS_1.resolveFor(actor).isVisible();
    }
}
