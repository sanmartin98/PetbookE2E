package co.com.devco.stepdefinitions;

import co.com.devco.questions.ResultadoFiltroPerro;
import co.com.devco.tasks.FiltroPerro;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FiltroPerroStepDefinition {
    @Cuando("^(.*) utilice el filtro de perro$")
    public void utilizarFiltroDePerro(String actor) {
        theActorCalled(actor).attemptsTo(
                FiltroPerro.filtrar()
        );
    }

    @Entonces("^debe ver solo las imagenes de los perros de la galeria$")
    public void debeVerSoloLasImagenesDeLosPerrosDeLaGaleria() {
        theActorInTheSpotlight().should(seeThat(
                ResultadoFiltroPerro.noHayGatos()
        ));
    }

}
