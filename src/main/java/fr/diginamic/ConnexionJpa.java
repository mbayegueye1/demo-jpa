package fr.diginamic;
import jakarta.persistence.*;
public class ConnexionJpa {
    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demo-jpa");
        EntityManager em = entityManagerFactory.createEntityManager();

    }
}