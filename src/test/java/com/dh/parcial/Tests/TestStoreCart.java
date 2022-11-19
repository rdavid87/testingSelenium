package com.dh.parcial.Tests;

import com.dh.parcial.Pages.PageStoreCart;
import com.dh.parcial.Reports.ExtentReport;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class TestStoreCart {

    private WebDriver driver;

    PageStoreCart page;

    ExtentReports report;
    ExtentTest test1;

    @BeforeEach
    public void setUp(){
        page = new PageStoreCart(driver);
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
    @DisplayName("Añade producto al carrito de compras")
    @Tag("smoke")
    public void test() throws InterruptedException {
        test1 = report.startTest("Añade producto al carrito de compras");
        test1.log(LogStatus.INFO, "Inicia Test");
        page.addCart("Samsung SyncMaster 941BW");
        test1.log(LogStatus.PASS,"Finalizo Test Correctamente");
        report.endTest(test1);
    }

}
