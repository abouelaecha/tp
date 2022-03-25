package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService service;
    @PostMapping("/create")
    public Client save(@RequestBody Client clt) {
        return service.save(clt);
    }
    @PutMapping("/update")
    public Client modify(@RequestBody Client clt) {
        return service.modify(clt);
    }
    @GetMapping("/{id}")
    public Client getOne(@PathVariable("id") long idClt) {
        return service.getOne(idClt);
    }
    @GetMapping("/all")
    public List<Client> getAll()  {
        return service.getAll();
    }
    @DeleteMapping("/{id}")
    public void Delete(@PathVariable("id") long idClt) {
        service.remove(idClt);
    }



}

