package es.neesis.facturaservice.service;

import es.neesis.facturaservice.dto.FacturaDTO;
import es.neesis.facturaservice.dto.UserDTO;
import es.neesis.facturaservice.feign.UsuarioClient;
import es.neesis.facturaservice.model.Factura;
import es.neesis.facturaservice.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FacturaService {

	@Autowired
	private FacturaRepository facturaRepository;

	@Autowired
	private UsuarioClient usuarioClient;

	public List<FacturaDTO> getFacturas() {
		List<Factura> facturas = facturaRepository.findAll();
		List<FacturaDTO> facturasDTO = facturas.stream().map(factura -> {
			UserDTO usuario = usuarioClient.getUsuario(factura.getIdUsuario());
			return new FacturaDTO(factura.getId(), factura.getTotal(), usuario);
		}).collect(Collectors.toList());
		return facturasDTO;
	}

	public FacturaDTO getFactura(Integer id) {
		Factura factura = facturaRepository.findById(id).orElse(null);
		if (factura == null)
			return null;

		UserDTO usuario = usuarioClient.getUsuario(factura.getIdUsuario());
		FacturaDTO facturaDTO = new FacturaDTO(factura.getId(), factura.getTotal(), usuario);
		return facturaDTO;

	}

}
