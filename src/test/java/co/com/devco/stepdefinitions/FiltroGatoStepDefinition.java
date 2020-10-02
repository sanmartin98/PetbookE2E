package co.com.devco.stepdefinitions;

import co.com.devco.questions.DetalleImagenPerro;
import co.com.devco.questions.ResultadoFiltroGato;
import co.com.devco.tasks.BuscarPerro;
import co.com.devco.tasks.FiltroGato;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FiltroGatoStepDefinition {
    @Cuando("^(.*) utilice el filtro de gato$")
    public void utilizarFiltroDeGato(String actor) {
        theActorCalled(actor).attemptsTo(
                FiltroGato.filtrar()
        );
    }

    @Entonces("^debe ver solo las imagenes de los gatos de la galeria$")
    public void debeVerSoloLasImagenesDeLosGatosQueSelecciono() {
        theActorInTheSpotlight().should(seeThat(
                ResultadoFiltroGato.noHayPerros()
        ));
    }
}
