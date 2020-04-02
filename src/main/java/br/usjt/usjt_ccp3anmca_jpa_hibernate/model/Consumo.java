package br.usjt.usjt_ccp3anmca_jpa_hibernate.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.mapping.List;

public class Consumo {
	
	@ManyToOne
	private Cidade cidade1;
	@ManyToOne
	private PrevisaoTempo previsaoTempo;
	
	@OneToMany (mappedBy = "cidade", cascade = CascadeType.ALL)
	private List consumos;	
	
	@Id
	@GeneratedValue
	private Long id;
	private Date dataHora;
	@OneToMany
	private Cidade cidade;

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setcidade(Object cidade2) {
	
		
	}
}
