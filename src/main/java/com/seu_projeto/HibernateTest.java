package com.seu_projeto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateTest {
    public static void main(String[] args) {
        // Cria o EntityManagerFactory usando o persistence-unit configurado
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");

        // Cria o EntityManager (conexão com o banco de dados)
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Inicia uma transação
        entityManager.getTransaction().begin();

        // Cria um novo produto
        Produto produto = new Produto("Notebook", 3500.00, 10);

        // Persiste o produto (salva no banco de dados)
        entityManager.persist(produto);

        // Confirma a transação
        entityManager.getTransaction().commit();

        // Fecha o EntityManager e o EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();

        System.out.println("Produto cadastrado com sucesso: " + produto);
    }
}
