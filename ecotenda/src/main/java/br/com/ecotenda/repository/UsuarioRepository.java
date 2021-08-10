package br.com.ecotenda.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ecotenda.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByUsuario(String Usuario);

	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);

	public Usuario findByNome(String nome);

}
