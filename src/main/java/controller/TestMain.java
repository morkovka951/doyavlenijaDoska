package controller;

import view.HomePage;
import view.WalcomePage;

import java.io.IOException;

/**
 * Created by M-Book on 16.05.2015.
 */
public class TestMain {
    public static void main (String[] args) throws IOException {

        WalcomePage walcomePage = new WalcomePage();
        walcomePage.showPage();

        HomePage homePage = new HomePage();
        homePage.showPage();
    }
}
