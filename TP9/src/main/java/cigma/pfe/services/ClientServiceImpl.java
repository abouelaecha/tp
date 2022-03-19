package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.dao.IClientDao;

public class ClientServiceImpl implements ClientService{

    private IClientDao dao;
    public void setDao(IClientDao dao) {
        this.dao = dao;
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
    public void removeById(long id) {
        dao.deleteById(id);
    }


}
