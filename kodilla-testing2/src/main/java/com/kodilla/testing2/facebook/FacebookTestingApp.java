package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

        public static final String XPATH_WAIT_FOR_1="//select[1]";
        public static final String XPATH_SELECT_1="//div[contains(@class, \"_58mq\")]/div/span/span/select[1]";
        public static final String XPATH_WAIT_FOR_2="//select[2]";
        public static final String XPATH_SELECT_2="//div[contains(@class, \"_58mq\")]/div/span/span/select[2]";
        public static final String XPATH_WAIT_FOR_3="//select[3]";
        public static final String XPATH_SELECT_3="//div[contains(@class, \"_58mq\")]/div/span/span/select[3]";
        public static void main(String[] args) {
            WebDriver driver= WebDriverConfig.getDriver(WebDriverConfig.CHROME);
            driver.get("https://www.facebook.com/");

            while(!driver.findElement(By.xpath(XPATH_WAIT_FOR_1)).isDisplayed());

            WebElement selectCombo=driver.findElement(By.xpath(XPATH_SELECT_1));
            Select selectBoard=new Select(selectCombo);
            selectBoard.selectByIndex(26);

            while(!driver.findElement(By.xpath(XPATH_WAIT_FOR_2)).isDisplayed());

            WebElement selectCombo2=driver.findElement(By.xpath(XPATH_SELECT_2));
            Select selectBoard2=new Select(selectCombo2);
            selectBoard2.selectByIndex(6);

            while(!driver.findElement(By.xpath(XPATH_WAIT_FOR_3)).isDisplayed());

            WebElement selectCombo3=driver.findElement(By.xpath(XPATH_SELECT_3));
            Select selectBoard3=new Select(selectCombo3);
            selectBoard3.selectByValue("1996");
        }
    }