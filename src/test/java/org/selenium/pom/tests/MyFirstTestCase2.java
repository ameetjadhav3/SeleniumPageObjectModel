package org.selenium.pom.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstTestCase2 {

    @Test
    public void dummyTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://askomdch.com");
    }
}
