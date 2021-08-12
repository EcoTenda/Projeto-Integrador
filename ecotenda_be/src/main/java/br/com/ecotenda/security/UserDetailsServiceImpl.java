package br.com.ecotenda.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.ecotenda.model.Usuario;
import br.com.ecotenda.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		Optional<Usuario> usuario = userRepository.findByEmail(userName);
		usuario.orElseThrow(() -> new UsernameNotFoundException(userName + " Not found."));
				
		return usuario.map(UserDetailsImpl::new).get();
		
	}

}
