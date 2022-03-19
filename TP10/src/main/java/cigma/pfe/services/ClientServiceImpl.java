package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.dao.IClientDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientServiceImpl implements ClientService{

    @Autowired
    private IClientDao dao;

    public ClientServiceImpl(IClientDao dao) {
        this.dao = dao;
        System.out.println("We are in constructor of ClientServiceImpl");
    }

    public ClientServiceImpl() {
        System.out.println("creation bean service");
    }

    @Override
    public Client save(Client c) {
        return dao.save(c);
    }

    @Override
    public Client modify(Client c) {
        return dao.update(c);
    }

    @Override
    public void delete(long id) {
        dao.deleteById(id);
    }



}
