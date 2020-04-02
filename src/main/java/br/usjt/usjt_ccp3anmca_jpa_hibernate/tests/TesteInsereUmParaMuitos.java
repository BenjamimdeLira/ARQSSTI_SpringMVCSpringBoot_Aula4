package br.usjt.usjt_ccp3anmca_jpa_hibernate.tests;

import java.util.*;
import java.util.List;

import javax.persistence.*;
import br.usjt.usjt_ccp3anmca_jpa_hibernate.model.*;

public class TesteInsereUmParaMuitos {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		List<Cidade> Cidades = new ArrayList<>();
		Cidade c1 = new Cidade();
		c1.setNome("Cidade 1");
		Cidade c2 = new Cidade();
		c2.setNome("Cidade 2");
		Cidades.add(c1);
		Cidades.add(c2);
		PrevisaoTempo p1 = new PrevisaoTempo();
		PrevisaoTempo PrevisaoTempo = new PrevisaoTempo();
		PrevisaoTempo.setDescricao("PrevisaoTempo de São Paulo");
		p1.setDescricao("Fortes pancadas de chuva na região");
		p1.setCidades(Cidades);
		PrevisaoTempo.add(p1);
		Object u1 = null;
		manager.persist(u1);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
