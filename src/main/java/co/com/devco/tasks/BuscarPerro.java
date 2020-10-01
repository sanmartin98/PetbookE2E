package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.PetbookHomePage.IMAGEN_PERRO_1;
import static co.com.devco.userinterfaces.PetbookHomePage.PETBOOK_HOME_PAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarPerro implements Task {
    private String perro;

    public BuscarPerro(String perro) {
        this.perro = perro;
    }

    public static Performable elPerro(String perro) {
        return instrumented(BuscarPerro.class, perro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(PETBOOK_HOME_PAGE),
                Click.on(IMAGEN_PERRO_1)
        );
    }
}
