package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.PetbookHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FiltroGato implements Task {

    public FiltroGato() {}

    public static Performable filtrar() {
        return instrumented(FiltroGato.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(PETBOOK_HOME_PAGE),
                Click.on(FILTRO_GATO)
        );
    }
}
