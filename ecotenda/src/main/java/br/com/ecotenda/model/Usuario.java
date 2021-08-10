package br.com.ecotenda.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "Campo nome obrigatório")
	@Size(min = 5, max = 100)
	private String nome;
	
	@NotNull(message = "Campo CPF obrigatório")
	@Size(min = 10, max = 20)
	private String cpf;
	
	@NotNull(message = "Campo email obrigatório")
	@Size(min = 10, max = 50) 
	private String email;
	
	@NotNull(message = "Campo senha obrigatório")
	@Size(min = 6)
	private String senha;
	
	@NotNull(message = "Campo data de nascimento obrigatório")
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate dataNascimento;

	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate dataCriacaoConta = LocalDate.now();
	
	@NotNull(message = "Campo tipo do usuario obrigatório")
	private String tipoUsuario;
	
	@OneToMany(mappedBy = "tb_categorias", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("tb_categorias")
	private List<Produto>produto;

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalDate getDataCriacaoConta() {
		return dataCriacaoConta;
	}

	public void setDataCriacaoConta(LocalDate dataCriacaoConta) {
		this.dataCriacaoConta = dataCriacaoConta;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	
}
