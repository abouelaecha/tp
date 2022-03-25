package cigma.pfe.repositories;
import cigma.pfe.models.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ClientRepositoryImpl implements ClientRepository{

    EntityManagerFactory emf=Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em=emf.createEntityManager();

    @Override
    public Client save(Client c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        return c;
//        System.out.println("DAO Layer : ClientRepositoryImpl Level");
//        return null;
    }
}
