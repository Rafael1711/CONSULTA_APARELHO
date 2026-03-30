package Pages;

import static Locators.Consulta_Aparelho_Amazon_Locators.*;

public class ConsultaAparelhoAmazonPage extends UsefulConstants {

     public void ConsultaAparelhoAmazon() {

          Xerxes.get("https://www.amazon.com.br"); // Acessa o site da Amazon

          VerificoTitulo(TITULO_CEP_LOCATOR, TITULO_CEP); // Verifica se navegamos até o site pelo título do CEP exibido
               Envio_O_Dado(CAMPO_PESQUISA, STRING_BUSCA); // No campo de pesquisa, envia a string de busca
                    ClicoNoElemento(BOTAO_PESQUISAR); // Clica no botão pesquisar

          String Descricao_Aparelho = EsperoEstarVisivel(TITULO_APARELHO).getText(); // Após o objeto de busca estar visível, captura a descrição
               System.out.println("\nString capturada: " + Descricao_Aparelho);
                    if(Descricao_Aparelho.contains(STRING_BUSCA)){ // Compara se a descrição do aparelho selecionado contém a string de busca inicial, isso serve para ter certeza que estamos no aparelho correto
                         System.out.println("\n=====---__ Aparelho correto em relação com a string de pesquisa __---=====");
                         System.out.println("String passada para busca: " + STRING_BUSCA + " | String capturada: " + Descricao_Aparelho);
                              String Valor_Aparelho = EsperoEstarVisivel(VALOR_APARELHO_LOCATOR).getText(); // Tendo certeza que estamos no aparelho correto, capturamos o valor dele
                              System.out.println("Valor capturado: " + Valor_Aparelho);
                                   FileHelperPage.salvarQtdArquivo(PATH_VALOR_APARELHO_AMAZON, Valor_Aparelho); // Chamando a classe FileHelper e o seu método Salvar arquivo, passamos o PATH do txt onde será armazenado o valor do aparelho, bem como o valor do aparelho em si
                    } else{
                         System.out.println("Aparelho incorreto em relação com a string de pesquisa | " + Descricao_Aparelho);
                    }
     }
}