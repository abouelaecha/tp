package cigma.pfe;

import cigma.pfe.models.Client;
import cigma.pfe.controllers.ClientController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonApplication {
    public static void main(String[] args)
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController)context.getBean("idCtrl");
       // Test save use case for three clients
        ctrl.save(new Client("OMAR"));
        ctrl.save(new Client("SIHAM"));
        ctrl.save(new Client("AHMED"));
        ctrl.save(new Client("FARAH"));
        // Test modify use case for client with id==1
        ctrl.modify(new Client(1L,"new Name"));
        // Test remove use case for client with id==1
        ctrl.removeById(1L);

    }

}
