package com.sqa.demoguru.automations.task;

import com.sqa.demoguru.automations.userinterfaces.DemoGuruPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowser implements Task {

    public static OpenTheBrowser on() {
        return instrumented(OpenTheBrowser.class);
    }

    @Override
    @Step("{0} opens the browser on DemoGuruPage")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new DemoGuruPage()));
    }
}
