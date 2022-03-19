package cigma.pfe;

import cigma.pfe.models.Client;
import cigma.pfe.models.ClientVip;
import cigma.pfe.models.ClientNormal;
import cigma.pfe.controllers.ClientController;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MonApplication {
    public static void main(String[] args)
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean("ctrl1");

        // nouveau client
        ctrl.save(new Client("zaynab"));

        ctrl.save(new ClientVip("oumaima VIP","preference 1"));
        ctrl.save(new ClientVip("zaynab VIP","preference 2"));

        ctrl.save(new ClientNormal("oumaima",1));
        ctrl.save(new ClientNormal("zaynab",1));



    }

}
