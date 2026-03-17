package Locators;

import org.openqa.selenium.By;

public interface Consulta_Aparelho_Amazon_Locators {
    static String TITULO_CEP = "Atualizar CEP";
    static String STRING_BUSCA = "Apple iPhone 16 Pro Max (256 GB) – Titânio-deserto";
    static String PATH_VALOR_APARELHO_AMAZON = "E:\\Projetos\\Automações\\Consulta_Aparelho\\VALOR_APARELHO_AMAZON.txt";

    By  TITULO_CEP_LOCATOR = By.xpath("//span[@id='glow-ingress-line2']");
    By  CAMPO_PESQUISA = By.xpath("//input[@id='twotabsearchtextbox']");
    By  BOTAO_PESQUISAR = By.xpath("//input[@id='nav-search-submit-button']");
    By  TITULO_APARELHO = By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']//span[contains(text(),'Apple iPhone 16 Pro Max (256 GB) – Titânio-deserto')]");
    By  VALOR_APARELHO_LOCATOR = By.xpath("//span[@class='a-price-whole'][contains(text(),'12.499')]");
}