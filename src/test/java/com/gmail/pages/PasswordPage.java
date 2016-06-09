package com.gmail.pages;

import com.gmail.config.Configuration;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Moses on 09/06/2016.
 */
public class PasswordPage
{
    public void userCanEnterPassword()
    {
        $("#Passwd").val(Configuration.password).pressEnter();
    }

    public LandingPage userClicksOnSigninButton()
    {
        $("#signIn").click();
        return new LandingPage();
    }
}
