package com.sqa.demoguru.automations.task;

import com.sqa.demoguru.automations.userinterfaces.DemoGuruComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Select implements Task {

    public static Select theButtonRegister() {
        return instrumented(Select.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DemoGuruComponent.DEMOGURU_BUTTONS));
    }
}
