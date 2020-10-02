package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetbookHomePage {
	public static final String PETBOOK_HOME_PAGE = "http://localhost:4200";
	public static final Target IMAGEN_PERRO_1 = Target.the("Imagen perro 1").located(By.xpath("//a[@href='/image/1']"));
	public static final Target IMAGEN_GATO_3 = Target.the("Imagen gato 3").located(By.xpath("//a[@href='/image/3']"));

	public static final Target FILTRO_GATO = Target.the("Boton filtro gato").located(By.xpath("//button[@id='btnGato']"));
	public static final Target FILTRO_PERRO = Target.the("Boton filtro perro").located(By.xpath("//button[@id='btnPerro']"));
}
