package br.usjt.usjt_ccp3anmca_jpa_hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_diaDaSemana")
public class DiaDaSemana {
	
	@OneToOne (mappedBy = "diaDaSemana")
	private DiaDaSemana diaDaSemana;
	
	@Id
	@GeneratedValue	
	private Long id;
	@Column(nullable = false, length = 200)
	
	@JoinColumn
	private String nome;
	@Column(nullable = false, length = 30)

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		DiaDaSemana other = (DiaDaSemana) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public void setPrevisaoTempo(PrevisaoTempo p) {
		// TODO Auto-generated method stub
		
	}
	
	
}
