package com.dh.parcial.Tests;

import com.dh.parcial.Pages.PageStoreRegister;
import com.dh.parcial.Reports.ExtentReport;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

public class TestStoreRegister {

    private WebDriver driver;

    PageStoreRegister page;

    ExtentReports report;
    ExtentTest test1;

    @BeforeEach
    public void setUp(){
        page = new PageStoreRegister(driver);
        driver = page.chromeDriverConnection();
        driver.get(page.getUrlBase());
        report = ExtentReport.getIntance();
    }

    @AfterEach
    public void tearDown() throws Exception {
        report.flush();
        driver.quit();
    }

    @Test
    @DisplayName("Registro de Usuario exitoso")
    @Tag("smoke")
    public void test() throws InterruptedException {
        test1 = report.startTest("Registro de Usuario exitoso");
        test1.log(LogStatus.INFO, "Inicia Test");
        page.registerUser();
        test1.log(LogStatus.PASS,"Finalizo Test Correctamente");
        report.endTest(test1);
    }

}
