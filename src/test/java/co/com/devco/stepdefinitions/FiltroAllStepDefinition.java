package co.com.devco.stepdefinitions;

import co.com.devco.questions.ResultadoFiltroAll;
import co.com.devco.tasks.FiltroAll;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FiltroAllStepDefinition {
    @Cuando("^(.*) utilice el filtro all$")
    public void utilizarFiltroAll(String actor) {
        theActorCalled(actor).attemptsTo(
                FiltroAll.filtrar()
        );
    }

    @Entonces("^debe ver todas las imagenes de la galeria$")
    public void debeVerTodasLasImagenesDeLaGaleria() {
        theActorInTheSpotlight().should(seeThat(
                ResultadoFiltroAll.hayPerrosyGatos()
        ));
    }
}
