package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;

public class ClientController {

    private ClientService service ;
    public void setService(ClientService service) {
        this.service = service;
    }
    public void save(Client c){
        service.save(c);
    }
    public void modify(Client c){
        service.modify(c);
    }
    public void removeById(long id){
        service.removeById(id);
    }

}
