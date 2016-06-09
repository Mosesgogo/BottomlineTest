package com.gmail.tests;

import com.gmail.config.Configuration;
import com.gmail.pages.LandingPage;
import com.gmail.pages.PasswordPage;
import com.gmail.pages.UsernamePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

/**
 * Created by Obaro on 09/06/2016.
 */
public class GmailSignInTest
{
    private UsernamePage usernamePage;
    private PasswordPage passwordPage;
    private LandingPage landingPage;

    @BeforeClass
    public void setUp() throws Exception
    {
        Configuration.launchUrl();
    }

    @Test
    public void GmailLoginTest()
    {
        usernamePage.userCanNavigateToGmailSignInPage();
        usernamePage.userCanEnterUsername();
        passwordPage = usernamePage.userCanClickOnNextButton();
        passwordPage.userCanEnterPassword();
        landingPage = passwordPage.userClicksOnSigninButton();
        landingPage.userCanSuccessfullySignIn();
    }

    @AfterClass
    public void tearDown()
    {
        closeWebDriver();
    }
}
