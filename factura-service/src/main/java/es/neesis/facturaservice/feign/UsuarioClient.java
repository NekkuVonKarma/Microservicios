package es.neesis.facturaservice.feign;

import es.neesis.facturaservice.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service")
public interface UsuarioClient {

	@GetMapping("/usuario/{id}")
	public UserDTO getUsuario(@PathVariable("id") Integer id);

}
