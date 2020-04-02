package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.Persistence;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsjtCcp3anmcaJpaHibernateApplication {

	public static void main(String[] args) {
		//SpringApplication.run(UsjtCcp3anmcaJpaHibernateApplication.class, args);
		Persistence.createEntityManagerFactory("usjtPU");
	}
	
	
}
