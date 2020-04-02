package br.usjt.usjt_ccp3anmca_jpa_hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.mapping.List;

@Entity
@Table(name = "tb_cidade")
public class Cidade {
	
	/*@OneToMany
	@JoinTable (name = "tb_cidade_previsaotempo",
	joinColumns = @JoinColumn (name = "id_previsaotempo"), inverseJoinColumns = @JoinColumn
	(name = "id_cidade"))
	private List cidades;*/
	
	@OneToMany (mappedBy = "cidade")
	private List cidades;	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private int latitude;
	private int longitude;

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

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	
	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public void setPrevisaoTempo(PrevisaoTempo p) {
		
		
	}
}
