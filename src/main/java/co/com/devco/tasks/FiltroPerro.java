package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.PetbookHomePage.FILTRO_PERRO;
import static co.com.devco.userinterfaces.PetbookHomePage.PETBOOK_HOME_PAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FiltroPerro implements Task {

    public FiltroPerro() {}

    public static Performable filtrar() {
        return instrumented(FiltroPerro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(PETBOOK_HOME_PAGE),
                Click.on(FILTRO_PERRO)
        );
    }
}
