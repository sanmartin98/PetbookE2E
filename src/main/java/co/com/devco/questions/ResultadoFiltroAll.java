package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.userinterfaces.PetbookHomePage.IMAGEN_GATO_POS_3;
import static co.com.devco.userinterfaces.PetbookHomePage.IMAGEN_PERRO_POS_1;

public class ResultadoFiltroAll implements Question<Boolean> {
    public ResultadoFiltroAll(){

    }

    public static ResultadoFiltroAll hayPerrosyGatos(){
        return new ResultadoFiltroAll();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (IMAGEN_PERRO_POS_1.resolveFor(actor).isVisible() && IMAGEN_GATO_POS_3.resolveFor(actor).isVisible());
    }
}
