package stepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Allpages;
import utils.Driver;

import static org.junit.Assert.assertTrue;

public class HomeStepdefs {

    Allpages elements = new Allpages();


    @Given("Anasayfaya git ve kontrol et")
    public void anasayfayaGitVeKontrolEt() {

        String ExpectedText = "Transport tickets and travel passes\n" +
                "wherever and whenever you want!";
        String ActualText = elements.transportTickets.getText();
        assertTrue(ExpectedText.equals(ActualText));


    }

    @When("Later butonuna tikla")
    public void laterButonunaTikla() {
        elements.laterButton.click();

    }

    @And("AgreeText kontrol et")
    public void agreetextKontrolEt() {
        String ExpectedText = "You can buy tickets and pass up to 50€, but you need to create an account in order to register a payment card.";
        String ActualText = elements.accountText.getText();
        assertTrue(ExpectedText.equals(ActualText));
    }

    @And("Agree butonuna tikla")
    public void agreeButonunaTikla() {
        elements.checkbox.click();
        if(elements.okButton.isDisplayed()){
            elements.okButton.click();
        }

    }


    @And("Location kontrol et ve ok butonuna tıkla")
    public void locationKontrolEtVeOkButonunaTıkla() {
        if(elements.locationText.isDisplayed()){
            elements.okLocationButton.click();
        }
    }

    @And("Harita kullanımına izin ver")
    public void haritaKullanımınaIzinVer() {
        String ExpectedText = "While using the app";
        assertTrue(elements.allowLocationButton.getText().contains(ExpectedText));
        elements.allowLocationButton.click();

    }

    @And("Transport Network alanına tıkla")
    public void transportNetworkAlanınaTıkla() {
        String ExpectedText = "Select transport network";
        //assertTrue(elements.selectTransportNetwork.getText().contains(ExpectedText));
        elements.selectTransportNetwork.click();
    }

    @And("Bir hat ekle")
    public void birHatEkle() {
        elements.addTransportNetwork.sendKeys("Atoumod ");
    }
}
