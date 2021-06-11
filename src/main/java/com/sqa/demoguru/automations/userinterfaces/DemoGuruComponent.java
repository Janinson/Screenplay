package com.sqa.demoguru.automations.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DemoGuruComponent {

    public static final Target DEMOGURU_BUTTONS = Target.the("DemoGuru button").locatedBy("//a[@href='register.php']");
}
