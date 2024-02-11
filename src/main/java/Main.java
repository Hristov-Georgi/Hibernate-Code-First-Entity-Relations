import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("PU_name");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();




        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
