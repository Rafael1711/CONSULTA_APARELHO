package Pages;

import java.awt.*;
import static Pages.UsefulConstants.*;

public class ChamadaDePaginas {
    public static void main(String[] args) throws InterruptedException {

        try {
            start();
            ConsultaAparelhoMercadoLivrePage ConsultaAparelhoMercadoLivrePageObject = new ConsultaAparelhoMercadoLivrePage();
                ConsultaAparelhoMercadoLivrePageObject.ConsultaAparelhoMarcadoLivre();
//                ConsultaAparelhoAmazonPage ConsultaAparelhoAmazonPageObject = new ConsultaAparelhoAmazonPage();
//                    ConsultaAparelhoAmazonPageObject.ConsultaAparelhoAmazon();
                        UsefulConstants.close();
        } catch (Exception e) {
            System.err.println("Erro no teste VerficarQtdUsuarios: " + e.getMessage());
            e.printStackTrace();
        } finally {
            close();
        }

    }
}