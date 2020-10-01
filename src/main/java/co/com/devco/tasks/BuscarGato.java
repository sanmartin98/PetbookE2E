package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.PetbookHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarGato implements Task {
    private String gato;

    public BuscarGato(String gato) {
        this.gato = gato;
    }

    public static Performable elGato(String gato) {
        return instrumented(BuscarGato.class, gato);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(PETBOOK_HOME_PAGE),
                Click.on(IMAGEN_GATO_3)
        );
    }
}
