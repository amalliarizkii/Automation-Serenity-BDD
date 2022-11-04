package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.*;

import static org.junit.Assert.assertEquals;

public class PaymentStepdefs {

    HomePage homepage;

    CampaignPage campaignpage;

    DonasiPage donasipage;

    PaymentPage paymentpage;

    SelectPaymentPage selectPaymentPage;

    InstruksiPage instruksiPage;

    @Given("I already on home page")
    public void iAlreadyOnHomePage() {
        homepage.open();
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

        @When("I click one of the campaign")
    public void ClickOneOfTheCampaign() {
        homepage.ClickOneOfTheCampaign();

    }

    @Then("I redirected to the campaign page")
    public void iRedirectedToTheCampaignPage() {
        assertEquals("https://kitabisa.com/[campaign/bantudekrasta]",campaignpage.getUrl());
        assertEquals("Satu Mata Dik Rasta Bengkak Menonjol Keluar",campaignpage.getTitleCampaign());
    }

    @When("I click Donasi button")
    public void ClickDonasiButton() {
        campaignpage.ClickDonasiButton();
    }

    @Then("I reditected to the donasi amount page")
    public void iReditectedToTheDonasiAmountPage() {
        assertEquals("https://kitabisa.com/campaign/bantudekrasta/donation-amount?slug=bantudekrasta",donasipage.getUrl());
        assertEquals("Masukkan Nominal Donasi",donasipage.getTitleDonasi());

    }

    @When("I input {int} in nominal donasi lainnya field")
    public void iInputInNominalDonasiLainnyaField(int jumlah) {
        donasipage.InputNominal(jumlah);
    }

    @And("I click Lanjut pembayaran button")
    public void iClickLanjutPembayaranButton() {
        donasipage.ClickButtonLanjutBayar();
    }

    @Then("I redirected to payment method page")
    public void iRedirectedToPaymentMethodPage() {
        assertEquals("https://kitabisa.com/campaign/bantudekrasta/contribute?auto_open_create_donation=true&slug=bantudekrasta",paymentpage.getUrl());
    }

    @When("I click pilih button")
    public void iClickPilihButton() {
        paymentpage.ClickButtonPilih();
    }

    @Then("I redirected to select payment method page")
    public void iRedirectedToSelectPaymentMethodPage() {
        assertEquals("https://kitabisa.com/campaign/bantudekrasta/payment-option?auto_open_create_donation=true&slug=bantudekrasta",selectPaymentPage.getUrl());
        assertEquals("Pembayaran instan (verifikasi otomatis, minimal nominal Rp.10,000)",selectPaymentPage.getHeaderTitle());
    }

    @When("I click BCA Virtual Account for payment method")
    public void iClickBCAVirtualAccountForPaymentMethod() {
        selectPaymentPage.ClickBCAButton();
    }

    @And("I input name {string}")
    public void iInputName(String name) {
        paymentpage.InputName(name);
    }

    @And("I input phone number {int}")
    public void iInputPhoneNumber(int phone) {
        paymentpage.InputPhoneNumber(phone);
    }

    @And("I click Lanjut pembayaran lagi button")
    public void iClickLanjutPembayaranLagiButton() {
        paymentpage.ClickPayment();
    }

    @Then("I redirected to instruksi pembayaran page")
    public void iRedirectedToInstruksiPembayaranPage() {
        assertEquals("https://kitabisa.com/campaign/bantudekrasta/contribute/summary/92927617?donate_to=non-proteksi",instruksiPage.getUrl());
        assertEquals("Instruksi Pembayaran",instruksiPage.getHeaderTitle());
    }

    @When("I click donasi ke penggalangan lain")
    public void iClickDonasiKePenggalanganLain() {
        instruksiPage.ClickButtonDonasiLain();
    }

    @Then("I redirected to home page")
    public void iRedirectedToHomePage() {
        assertEquals("https://kitabisa.com//",homepage.getUrl());
    }
}
