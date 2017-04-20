package model;

import java.util.*;

import javax.persistence.*;

@Entity
public class Curatore {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	@Temporal(TemporalType.DATE)
	private Date dataNascita;
	@OneToMany(mappedBy = "curatore")
	private List<Stanza> stanze;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public List<Stanza> getStanze() {
		return stanze;
	}
	public void setStanze(List<Stanza> stanze) {
		this.stanze = stanze;
	}

}
