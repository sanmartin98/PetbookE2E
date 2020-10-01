package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetbookHomePage {
	public static final String PETBOOK_HOME_PAGE = "http://localhost:4200";
	//public static final Target IMAGEN_PERRO_1 = Target.the("Imagen perro 1").located(By.xpath("/html/body/app-root/div/app-imagegallery/div/div[3]/ul/li[1]/a/img"));
	public static final Target IMAGEN_PERRO_1 = Target.the("Imagen perro 1").located(By.xpath("//a[@href='/image/1']"));
}
