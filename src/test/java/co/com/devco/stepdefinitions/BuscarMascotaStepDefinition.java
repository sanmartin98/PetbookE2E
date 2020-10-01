package co.com.devco.stepdefinitions;

import co.com.devco.questions.DetalleImagen;
import co.com.devco.tasks.BuscarPerro;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuscarMascotaStepDefinition {
    @Cuando("^(.*) selecciona la imagen correspondiente al perro (.*)$")
    public void seleccionarImagenPerro(String actor, String idPerro) {
        theActorCalled(actor).attemptsTo(
                BuscarPerro.elPerro(idPerro)
        );
    }

    @Entonces("^debe ver solo la imagen del perro que selecciono$")
    public void debeVerSoloLaImagenDelPerroQueSelecciono() {
        theActorInTheSpotlight().should(seeThat(
                DetalleImagen.esVisible()
        ));
    }

}
