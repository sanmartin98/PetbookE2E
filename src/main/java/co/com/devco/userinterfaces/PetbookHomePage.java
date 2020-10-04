package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetbookHomePage {
	public static final String PETBOOK_HOME_PAGE = "http://localhost:4200";
	public static final Target IMAGEN_PERRO_POS_1 = Target.the("Imagen perro posicion 1").located(By.xpath("//a[@href='/image/1']"));
	public static final Target IMAGEN_GATO_POS_3 = Target.the("Imagen gato posicion 3").located(By.xpath("//a[@href='/image/3']"));
	public static final Target FILTRO_ALL = Target.the("Boton filtro all").located(By.xpath("//button[@id='btnAll']"));
	public static final Target FILTRO_GATO = Target.the("Boton filtro gato").located(By.xpath("//button[@id='btnGato']"));
	public static final Target FILTRO_PERRO = Target.the("Boton filtro perro").located(By.xpath("//button[@id='btnPerro']"));
}
