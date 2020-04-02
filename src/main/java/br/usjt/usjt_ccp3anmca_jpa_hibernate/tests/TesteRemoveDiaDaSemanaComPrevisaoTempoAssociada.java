package br.usjt.usjt_ccp3anmca_jpa_hibernate.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.JPAUtil;
import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.PrevisaoTempo;

public class TesteRemoveDiaDaSemanaComPrevisaoTempoAssociada {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		PrevisaoTempo p = manager.find(PrevisaoTempo.class, 1L);
		manager.remove(p);
		manager.close();
		JPAUtil.close();
	}
}
