package com.dh.parcial.Pages;

import com.dh.parcial.Base.BasePage;
import com.dh.parcial.Model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class PageStoreRegister extends BasePage {

    private User usuario = new User("Ronald", "David", "dlanordavid.1987@gmail.com", "123342342", "ABC.123122312", 1);

    By linkMenu = By.xpath("//*[@id=\"top-links\"]/ul/li[2]");
    By linkRegister = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");

    By firstName = By.name("firstname");
    By lastName = By.name("lastname");
    By email = By.name("email");
    By telephone = By.name("telephone");
    By password = By.name("password");
    By confirm = By.name("confirm");
    By newsletterTrue = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
    By newsletterFalse = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
    By agree = By.name("agree");
    By submit = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
    By finalizar = By.xpath("//*[@id=\"content\"]/div/div/a");
    public PageStoreRegister(WebDriver driver) {
        // TODO Auto-generated constructor stub
    }


    public void registerUser() throws InterruptedException{
        oprimir(linkMenu);
        oprimir(linkRegister);
        teclear(usuario.getFirstName(), firstName);
        teclear(usuario.getLastName(), lastName);
        teclear(randomEmail(), email);
        teclear(usuario.getTelephone(), telephone);
        teclear(usuario.getPassword(), password);
        teclear(usuario.getPassword(), confirm);
        oprimir(newsletterFalse);
        oprimir(agree);
        oprimir(submit);
        Thread.sleep(2000);
        oprimir(finalizar);
    }

    protected String randomEmail() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr+"@gmail.com";

    }
}
