package br.usjt.usjt_ccp3anmca_jpa_hibernate.tests;

import javax.persistence.EntityManager;

import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.DiaDaSemana;
import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.JPAUtil;

public class TesteBuscaPorIdComGetReference {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		DiaDaSemana u = manager.getReference(DiaDaSemana.class, 1L);
		System.out.println(u);
		manager.close();
		JPAUtil.close();
	}
}
