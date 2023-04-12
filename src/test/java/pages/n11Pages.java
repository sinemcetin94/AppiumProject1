package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.List;


public class n11Pages {
  AppiumDriver driver;
  WebDriverWait wait;
  ElementHelper elementHelper;
  By kategorilerButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\")");
  By appleButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Apple\")");
  By filtrele = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/listingFilterRL\")");
  //By dahiliHafiza = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Dahili Hafıza\")");
  By GB = MobileBy.AndroidUIAutomator("new UiSelector().text(\"128 GB\")");
  By uygulaButonu = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/applyBtn\")");
  By model = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Model\")");
  By Iphone13 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Iphone 13\")");
  By mavi = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Mavi\")");
  By sonuclariGosterButonu = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/giybiFilterShowResultsBTN\")");
  By sepeteEkleIkonu = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivAddToBasket\")");
  By sepeteEkleButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepete Ekle\")");
  By sepetimButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepetim\")");
  By urunum = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/basketItemProductLayoutRoot\")");
  public n11Pages(AppiumDriver driver){
    this.driver = driver;
    this.wait = new WebDriverWait(driver, 10);
    this.elementHelper = new ElementHelper(driver);

  }

  public void kategoriTiklama() {
    driver.findElement(kategorilerButonu).click();
  }

  public void elektronikTiklama() {
    List<WebElement> listofElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
    listofElement.get(1).click();
  }

  public void telefonveAkseasuarSecimi() {
    List<WebElement> listofElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
    listofElement.get(0).click();
  }

  public void cepTelefonuSecimi() {
    List<WebElement> listofElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
    listofElement.get(0).click();
  }

  public void markaSecimi() {
    driver.findElement(appleButonu).click();


  }

  public void filtrelemeTiklama() {
    driver.findElement(filtrele).click();
  }

  public void filtrelemeYap() {
    List<WebElement> listUrunOzellikleri = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/typeNameTV\")"));
    listUrunOzellikleri.get(2).click(); //dahilihafizaya tıklama
    driver.findElement(GB).click();
    driver.findElement(uygulaButonu).click();
    listUrunOzellikleri.get(4).click(); //modele tıklama
    driver.findElement(Iphone13).click();
    driver.findElement(uygulaButonu).click();
    listUrunOzellikleri.get(8).click(); //renke tiklama //hata
    driver.findElement(mavi).click(); //mavi renge tiklama
   driver.findElement(uygulaButonu).click();
  }
  
  public void sonuclariGosterTiklama() {
    driver.findElement(sonuclariGosterButonu).click();

  }

  public void urunSepeteEkleme() {
    driver.findElement(sepeteEkleIkonu).click();
    List<WebElement> secenekListesi = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/skuNameTV\")"));
    secenekListesi.get(1).click();
    secenekListesi.get(3).click();
    driver.findElement(sepeteEkleButonu).click();
  }
  public void sepeteGit() {
    driver.findElement(sepetimButonu).click();
  }

  public void sepetKontrol() {
    elementHelper.checkVisible(urunum);
  }
}
