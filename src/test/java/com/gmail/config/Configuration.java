package com.gmail.config;


import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Configuration.timeout;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Moses on 09/06/2016.
 */
public class Configuration
{
    public static String username = System.getProperty("username", "xxxxxx@gmail.com");
    public static String password = System.getProperty("password", "yyyyyy");


    public static void launchUrl()
    {
        timeout = 5000;
        baseUrl = "http://www.gmail.com";
        startMaximized = true;

        open("/");
    }

}
