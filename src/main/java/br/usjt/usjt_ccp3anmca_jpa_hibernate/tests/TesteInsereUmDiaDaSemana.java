package br.usjt.usjt_ccp3anmca_jpa_hibernate.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.DiaDaSemana;
import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.JPAUtil;

public class TesteInsereUmDiaDaSemana {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		DiaDaSemana u = new DiaDaSemana();
		u.setNome("Segunda-Feira");
		manager.persist(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
