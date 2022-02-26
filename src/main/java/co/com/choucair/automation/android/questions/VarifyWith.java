package co.com.choucair.automation.android.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.choucair.automation.android.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.questions.Text.*;

public class VarifyWith implements Question<Boolean> {

    private String question;

    public VarifyWith(String question){
        this.question = question;
    }

    public static VarifyWith the(String question) {
        return new VarifyWith(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
       String answer = of(TEXT_LABEL).viewedBy(actor).asString();
        return question.equals(answer);
    }
}
