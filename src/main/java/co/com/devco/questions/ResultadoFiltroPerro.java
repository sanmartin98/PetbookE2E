package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.userinterfaces.PetbookHomePage.IMAGEN_GATO_POS_3;

public class ResultadoFiltroPerro implements Question<Boolean> {
    public ResultadoFiltroPerro(){

    }

    public static ResultadoFiltroPerro noHayGatos(){
        return new ResultadoFiltroPerro();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return !IMAGEN_GATO_POS_3.resolveFor(actor).isVisible();
    }
}
