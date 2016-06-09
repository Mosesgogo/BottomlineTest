package com.gmail.pages;


import com.gmail.config.Configuration;

import static com.codeborne.selenide.Selenide.$;


/**
 * Created by Moses on 09/06/2016.
 */
public class UsernamePage
{


    public void userCanNavigateToGmailSignInPage()
    {
        Configuration.launchUrl();
    }

    public void userCanEnterUsername()
    {
        $("#Email").val(Configuration.username);
    }

    public PasswordPage userCanClickOnNextButton()
    {
        $("#next").click();
        return new PasswordPage();
    }
}
