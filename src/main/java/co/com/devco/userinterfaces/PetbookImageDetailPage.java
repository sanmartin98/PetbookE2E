package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetbookImageDetailPage {
	public static final String PETBOOK_IMAGE_DETAIL_PAGE = "http://localhost:4200/image/";
	public static final Target IMAGE_CONTAINER = Target.the("Contenedor que muestra el detalle de la imagen").located(By.xpath("//div[@class='img-container']"));
}
