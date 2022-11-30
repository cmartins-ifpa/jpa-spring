package ifpa.appjpa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.Nullable;

@Entity
public class Produto implements Serializable {
	private static final long serialVersionUID = 268705783697101576L;
	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE)
	private Long id;
	private String nome;
	private boolean ativo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date cadastro;

    private int quantidade;

    public Produto() {
	}
    // gets e set´s
    
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

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Date getCadastro() {
		return cadastro;
	}

	public void setCadastro(Date cadastro) {
		this.cadastro = cadastro;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
 
}