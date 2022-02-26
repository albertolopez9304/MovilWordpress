package co.com.choucair.automation.android.tasks;

import co.com.choucair.automation.android.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.automation.android.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.actions.Click.*;
import static net.serenitybdd.screenplay.actions.Enter.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.waits.WaitUntil.*;

public class Login implements Task {
    private String user;
    private String password;

    public Login (String user, String password){
        this.user = user;
        this.password = password;
    }
    public static Login with(String user, String password) {
        return Tasks.instrumented(Login.class,user,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                theValue(user).into(EMAIL_INPUT),
                on(EMAIL_BUTTON),
                on(PASSWORD_LINK),
                theValue(password).into(PASSWORD_INPUT),
                on(PASSWORD_BUTTON),
                the(TEXT_LABEL, isPresent()).forNoMoreThan(10).seconds());
    }
}

