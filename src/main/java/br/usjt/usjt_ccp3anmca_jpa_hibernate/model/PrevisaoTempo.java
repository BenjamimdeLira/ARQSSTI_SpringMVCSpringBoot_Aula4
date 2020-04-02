package br.usjt.usjt_ccp3anmca_jpa_hibernate.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_previsaoTempo")
public class PrevisaoTempo {
	@OneToOne (optional = false)
	@Id
	@GeneratedValue
	@JoinColumn (name = "id_da_minha_previsaoDoTempo")
	private Long id;
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrevisaoTempo other = (PrevisaoTempo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public void setNome(Cidade u) {
	
		
	}

	public void add(PrevisaoTempo p1) {
	
		
	}

	public void setCidades(List<Cidade> cidades) {
		
		
	}
}
