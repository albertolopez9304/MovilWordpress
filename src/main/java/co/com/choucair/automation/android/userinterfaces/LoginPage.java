package co.com.choucair.automation.android.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import static net.serenitybdd.screenplay.targets.Target.*;

public class LoginPage {
    public static final Target EMAIL_INPUT = the("input for write email").located(By.id("org.wordpress.android:id/input"));
    public static final Target EMAIL_BUTTON = the("button next email").located(By.id("org.wordpress.android:id/primary_button"));
    public static final Target PASSWORD_LINK = the("input for write password").located(By.id("org.wordpress.android:id/login_enter_password"));
    public static final Target PASSWORD_INPUT = the("button next password").located(By.id("org.wordpress.android:id/input"));
    public static final Target PASSWORD_BUTTON = the("text label for validations").located(By.id("org.wordpress.android:id/primary_button"));
    public static final Target TEXT_LABEL = the("text label for validations").located(By.id("org.wordpress.android:id/logged_in_as_heading"));
}
