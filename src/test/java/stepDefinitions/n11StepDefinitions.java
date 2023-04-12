package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.n11Pages;
import util.DriverFactory;

public class n11StepDefinitions {
    n11Pages n11Page = new n11Pages(DriverFactory.getDriver());
    @When("Kategorilere tiklanir")
    public void kategorilereTiklanir() {
        n11Page.kategoriTiklama();
    }

    @When("Elektronik tiklanir")
    public void elektronikTiklanir() {
        n11Page.elektronikTiklama();
    }

    @When("TelefonveAksesuarlari secilir")
    public void telefonveaksesuarlariSecilir() {
        n11Page.telefonveAkseasuarSecimi();
    }

    @When("CepTelefonu secilir")
    public void ceptelefonuSecilir() {
        n11Page.cepTelefonuSecimi();
    }

    @When("Marka secilir")
    public void markaSecilir() {
        n11Page.markaSecimi();
    }

    @When("Filtrelemeye tiklanir")
    public void filtrelemeyeTiklanir() {
        n11Page.filtrelemeTiklama();
    }

    @When("Filtreleme yapilir")
    public void filtrelemeYapilir() {
        n11Page.filtrelemeYap();
    }

    @When("Sonuclari gostere tiklanir")
    public void sonuclariGostereTiklanir() {
        n11Page.sonuclariGosterTiklama();
    }

    @When("Urun sepete eklenir")
    public void urunSepeteEklenir() {
        n11Page.urunSepeteEkleme();
    }

    @When("Sepetime gidilir")
    public void sepetimeGidilir() {
        n11Page.sepeteGit();
    }

    @Then("Sepete urunun geldigi kontrol edilir")
    public void sepeteUrununGeldigiKontrolEdilir() {
        n11Page.sepetKontrol();
    }
}
