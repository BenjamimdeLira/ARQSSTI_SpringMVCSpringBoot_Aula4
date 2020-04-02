package br.usjt.usjt_ccp3anmca_jpa_hibernate.tests;

import javax.persistence.*;
import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.*;

public class TesteInserção {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Cidade u = new Cidade();
		u.setNome("São Paulo");
		PrevisaoTempo p = new PrevisaoTempo();
		p.setDescricao("PrevisaoTempo de São Paulo");
		p.setNome(u);
		u.setPrevisaoTempo(p);
		PrevisaoTempo PrevisaoTempo = new PrevisaoTempo();
		PrevisaoTempo.setDescricao("Fortes Pancadas de Chuva ao Noroeste");
		Consumo consumo = new Consumo();
		Object cidade = null;
		consumo.setcidade(cidade);
		manager.persist(consumo);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}