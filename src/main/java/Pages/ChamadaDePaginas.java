package Pages;

import java.awt.*;
import static Pages.UsefulConstants.*;

public class ChamadaDePaginas {
    public static void main(String[] args) throws InterruptedException {

        try {
            start();
                ConsultaAparelhoAmazonPage ConsultaAparelhoAmazonPageObject = new ConsultaAparelhoAmazonPage();
                    ConsultaAparelhoAmazonPageObject.ConsultaAparelhoAmazon();
                        UsefulConstants.close();
        } catch (Exception e) {
            System.err.println("Erro no teste Consulta_Amazon: " + e.getMessage());
            e.printStackTrace();
        } finally {
            close();
        }

    }
}