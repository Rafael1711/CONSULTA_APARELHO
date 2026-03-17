package Locators;

import org.openqa.selenium.By;

public interface Consulta_Aparelho_Mercado_Livre_Locators {
    static String TITULO_CRIE_SUA_CONTA = "Crie a sua conta";
    static String STRING_BUSCA = "Apple iPhone 16 Pro Max (256 GB) – Titânio-deserto";
    static String PATH_VALOR_APARELHO_AMAZON = "E:\\Projetos\\Automações\\Consulta_Aparelho\\VALOR_APARELHO_MERCADO_LIVRE.txt";

    By  TITULO_CRIE_SUA_CONTA_LOCATOR = By.xpath("//a[contains(text(),'Crie a sua conta')]");
    By  CAMPO_PESQUISA = By.xpath("//input[@id='cb1-edit']");
    By  BOTAO_PESQUISAR = By.xpath("//div[@class='nav-icon-search']");
    By  TITULO_APARELHO = By.xpath("//a[contains(text(),'Apple iPhone 16 Pro Max (256 GB) - Titânio-deserto')]");
    By  VALOR_APARELHO_LOCATOR = By.xpath("//span[@class='andes-money-amount ui-pdp-price__part andes-money-amount--cents-superscript andes-money-amount--compact']//span[@class='andes-money-amount__fraction'][contains(text(),'7.499')]");
}