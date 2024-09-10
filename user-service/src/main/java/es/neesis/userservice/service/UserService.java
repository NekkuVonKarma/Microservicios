package es.neesis.userservice.service;

import es.neesis.userservice.dto.UserDTO;
import es.neesis.userservice.model.User;
import es.neesis.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserDTO getUser(Integer idUsuario) {
		User user = userRepository.findById(idUsuario).orElse(null);
		if (user != null) {
			return new UserDTO(user.getId(), user.getUsername(), user.getPassword(), user.getEmail());
		}
		return null;
	}

}
