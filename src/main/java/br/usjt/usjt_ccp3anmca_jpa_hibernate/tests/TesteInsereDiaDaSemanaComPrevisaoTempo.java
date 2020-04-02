package br.usjt.usjt_ccp3anmca_jpa_hibernate.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.DiaDaSemana;
import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.JPAUtil;
import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.PrevisaoTempo;

public class TesteInsereDiaDaSemanaComPrevisaoTempo {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		PrevisaoTempo p = new PrevisaoTempo();
		p.setDescricao("Previsão de Segunda-feira com chuva e frio");
		manager.persist(p);
		DiaDaSemana u = new DiaDaSemana();
		u.setNome("Segunda-Feira");
		u.setPrevisaoTempo(p);
		manager.persist(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
