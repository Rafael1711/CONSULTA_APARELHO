package Pages;

import static Locators.Consulta_Aparelho_Mercado_Livre_Locators.*;

public class ConsultaAparelhoMercadoLivrePage extends UsefulConstants {

     public void ConsultaAparelhoMarcadoLivre() {

          Xerxes.get("https://mercadolivre.com.br");

          VerificoTitulo(TITULO_CRIE_SUA_CONTA_LOCATOR, TITULO_CRIE_SUA_CONTA);
               Envio_O_Dado(CAMPO_PESQUISA, STRING_BUSCA);
                    ClicoNoElemento(BOTAO_PESQUISAR);

          String Descricao_Aparelho = EsperoEstarVisivel(TITULO_APARELHO).getText();
               System.out.println("\nString capturada: " + Descricao_Aparelho);
                    if(STRING_BUSCA.contains(Descricao_Aparelho)){
                         System.out.println("\n=====---__ Aparelho correto em relação com a string de pesquisa __---=====");
                         System.out.println("String passada para busca: " + STRING_BUSCA + " | String capturada: " + Descricao_Aparelho);
                              ClicoNoElemento(TITULO_APARELHO);
                              String Valor_Aparelho = EsperoEstarVisivel(VALOR_APARELHO_LOCATOR).getText();
                                   System.out.println("Valor capturado: " + Valor_Aparelho);
                                   FileHelperPage.salvarQtdArquivo(PATH_VALOR_APARELHO_AMAZON, Valor_Aparelho);
                    } else {
                         System.out.println("Aparelho incorreto em relação com a string de pesquisa | " + Descricao_Aparelho);
                    }
     }
}