package es.neesis.facturaservice.dto;

public class UserDTO {
	private Integer idUsuario;
	private String username;
	private String password;
	private String email;

	public UserDTO() {
	}

	public UserDTO(Integer idUsuario, String username, String password, String email) {
		this.idUsuario = idUsuario;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
