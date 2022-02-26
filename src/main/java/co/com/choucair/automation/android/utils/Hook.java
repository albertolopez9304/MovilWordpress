package co.com.choucair.automation.android.utils;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class Hook {
    @Before
    public void prepareStage(){
        setTheStage(new OnlineCast());
    }
}
