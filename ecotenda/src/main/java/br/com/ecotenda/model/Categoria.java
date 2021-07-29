package br.com.ecotenda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "Valor obrigatorio!")
	@Size(min = 2, max = 30)
	private String categoria_produtos;
	
	@Size(min = 5, max = 200)
	private String descricao;

	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoria_produtos() {
		return categoria_produtos;
	}

	public void setCategoria_produtos(String categoria_produtos) {
		this.categoria_produtos = categoria_produtos;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
		

}
