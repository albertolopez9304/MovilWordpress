package co.com.choucair.automation.android.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import static net.serenitybdd.screenplay.targets.Target.*;

public class ApplicationHomepage {
    public static final Target LOGIN_BUTTON = the("login button").located(By.id("org.wordpress.android:id/login_button"));
}
