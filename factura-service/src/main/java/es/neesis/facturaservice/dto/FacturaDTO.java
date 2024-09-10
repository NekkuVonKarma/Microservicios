package es.neesis.facturaservice.dto;

import es.neesis.facturaservice.model.Factura;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class FacturaDTO {
	private Integer id;
	private BigDecimal total;
	private UserDTO usuario;

	public FacturaDTO() {
	}

	public FacturaDTO(Integer id, BigDecimal total, UserDTO usuario) {
		this.id = id;
		this.total = total;
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public UserDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UserDTO usuario) {
		this.usuario = usuario;
	}
}
