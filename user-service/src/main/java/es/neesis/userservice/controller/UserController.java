package es.neesis.userservice.controller;

import es.neesis.userservice.dto.UserDTO;
import es.neesis.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/usuario/{id}")
	public UserDTO getUsuario(@PathVariable("id") Integer id) {
		return userService.getUser(id);
	}

}
