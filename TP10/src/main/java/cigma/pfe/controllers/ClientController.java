package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("ctrl1")
public class ClientController {

    @Autowired
    private ClientService service;

    public ClientController(ClientService service) {
        System.out.println("Call ClientController with clientService param....");
        this.service = service;
    }

    public ClientController() {
        System.out.println("creation bean controller");
    }

    public Client save(Client c ){
        return service.save(c);
    }
    public Client modify(Client c){
        return service.modify(c);
    }
    public void removeById(long id){
        service.delete(id);
    }


}
