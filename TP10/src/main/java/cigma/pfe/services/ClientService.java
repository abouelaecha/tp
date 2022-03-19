package cigma.pfe.services;
import cigma.pfe.models.Client;

public interface ClientService {
    Client save(Client c);
    Client modify(Client c);
    void delete(long id);
}
