package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import javax.print.attribute.Attribute;

public class PetbookImageDetailPage {
	public static final Target IMAGE_CONTAINER_PERRO_1 = Target.the("Contenedor que muestra el detalle de la imagen del perro 1").located(By.xpath("//div[@style='background-image: url(\"assets/images/perro1.jpg\");']"));
	public static final Target IMAGE_CONTAINER_GATO_3 = Target.the("Contenedor que muestra el detalle de la imagen del gato 3").located(By.xpath("//div[@style='background-image: url(\"assets/images/gato1.jpg\");']"));
}
