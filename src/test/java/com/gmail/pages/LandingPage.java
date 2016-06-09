package com.gmail.pages;

import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Obaro on 09/06/2016.
 */
public class LandingPage
{
    public void userCanSuccessfullySignIn()
    {
        Assert.assertTrue($("#:hf.aic z0").isDisplayed(), "User is not successfully signed in");
    }
}
