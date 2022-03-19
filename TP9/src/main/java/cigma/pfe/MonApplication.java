package cigma.pfe;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.models.Promotion;
import cigma.pfe.controllers.ClientController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class MonApplication {
    public static void main(String[] args)
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctr = (ClientController)context.getBean("ctrl1");

        /* Client client = new Client("OMAR");
        List<Facture> factures = Arrays.asList(new Facture("1500.0","facture1",client),new Facture("2000.0","facture2",client));
        client.setFactures(factures);
        ctr.save(client); */

        Client client = new Client("OMAR");
        List<Promotion> promotions=Arrays.asList(new Promotion("remise 10%"),new Promotion("solde 40%"));
        client.setPromotions(promotions);
        ctr.save(client);



    }

}
