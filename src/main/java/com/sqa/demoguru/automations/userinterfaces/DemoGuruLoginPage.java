package com.sqa.demoguru.automations.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DemoGuruLoginPage {
    public static final Target signInLinkLocator = Target.the("Sing in  button").locatedBy("//a[@href='login.php']");
    public static final Target userName = Target.the("User name").locatedBy("//input[@name='userName']");
    public static final Target password = Target.the("password").locatedBy("//input[@name='password']");
    public static final Target submitButton = Target.the("Submit button").locatedBy("//input[@name='submit']");
}