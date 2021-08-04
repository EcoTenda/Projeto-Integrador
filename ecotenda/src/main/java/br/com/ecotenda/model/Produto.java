package br.com.ecotenda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "Campo nome obrigatório")
	@Size(min = 2, max = 100)
	private String nome;
	
	@NotNull(message = "Campo quantidade obrigatório")
	@Positive
	private int quantidade;
	
	@NotNull(message = "Campo valor obrigatório")
	@Positive
	private double valor; 
	
	@NotNull(message = "Campo descrição obrigatório")
	@Size(min = 5, max = 200)
	private String descricao;
	
	@NotNull(message = "Campo garantia obrigatório")
	@Size(min = 5, max = 200)
	private String garantia;
	
	@ManyToOne
	@JsonIgnoreProperties("tb_produtos")
	private Categoria tb_categorias;

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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getGarantia() {
		return garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

	public Categoria getTb_categorias() {
		return tb_categorias;
	}

	public void setTb_categorias(Categoria tb_categorias) {
		this.tb_categorias = tb_categorias;
	}
}
