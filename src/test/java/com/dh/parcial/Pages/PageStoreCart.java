package com.dh.parcial.Pages;

import com.dh.parcial.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageStoreCart extends BasePage {


    By inputSearch = By.name("search");
    By searchButton = By.xpath("//*[@id=\"search\"]/span/button");
    By resultSearch = By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a");

    By addCartButton = By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]");
    By itemCart = By.id("cart-total");
    public PageStoreCart(WebDriver driver) {
        // TODO Auto-generated constructor stub
    }

    public void addCart(String nameProduct) throws InterruptedException{
        teclear(nameProduct, inputSearch);
        oprimir(searchButton);
        esperaExplicita(resultSearch,nameProduct, 10);
        oprimir(addCartButton);
        esperaExplicitaContains(itemCart, "1 item(s)", 10);
    }
}
