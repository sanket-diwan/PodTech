package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://portal.apistrong.io");

    }
}