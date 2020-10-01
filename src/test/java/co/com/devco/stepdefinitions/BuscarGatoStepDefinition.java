package co.com.devco.stepdefinitions;

import co.com.devco.questions.DetalleImagenGato;
import co.com.devco.tasks.BuscarGato;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuscarGatoStepDefinition {
    @Cuando("^(.*) selecciona la imagen correspondiente al gato (.*)$")
    public void cristobalSeleccionaLaImagenCorrespondienteAlGato(String actor, String idGato) {
        theActorCalled(actor).attemptsTo(
                BuscarGato.elGato(idGato)
        );
    }

    @Entonces("^debe ver solo la imagen del gato que selecciono$")
    public void debeVerSoloLaImagenDelGatoQueSelecciono() {
        theActorInTheSpotlight().should(seeThat(
                DetalleImagenGato.esVisible()
        ));
    }
}
