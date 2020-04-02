package br.usjt.usjt_ccp3anmca_jpa_hibernate.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.DiaDaSemana;
import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.JPAUtil;

public class TesteRemoveDiaDaSemana {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		DiaDaSemana u = manager.find(DiaDaSemana.class, 1L);
		manager.remove(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
