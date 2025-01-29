package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		// PESSOAS REGISTRADAS
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Daniela Gomes", "daniela@gmail.com");
		Pessoa p3 = new Pessoa(null, "Diogenes Azevedo", "diogenes@gmail.com");
		
		
		// CONEXÃO COM BANCO DE DADOS
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		// IMPLEMENTANDO NO BANCO DE DADOS
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
	}

}
