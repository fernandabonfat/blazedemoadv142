package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage extends CommonPage {
    // constructor
    public PurchasePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // mapeamento de elementos
    @FindBy(css = "h2")
    WebElement flightConfirmation; // cabeçalho da página de compra

    // ações
    public String lerCabecalhoPaginaCompra() {
        return flightConfirmation.getText();
    }
}