package es.neesis.facturaservice.service;

import es.neesis.facturaservice.dto.FacturaDTO;
import es.neesis.facturaservice.dto.UserDTO;
import es.neesis.facturaservice.feign.UsuarioClient;
import es.neesis.facturaservice.model.Factura;
import es.neesis.facturaservice.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {

	@Autowired
	private FacturaRepository facturaRepository;

	@Autowired
	private UsuarioClient usuarioClient;

	public Iterable<FacturaDTO> getFacturas() {
		Iterable<Factura> facturas = facturaRepository.findAll();
		Iterable<FacturaDTO> facturasDTO = null;
		for (Factura factura : facturas) {
			UserDTO usuario = usuarioClient.getUsuario(factura.getIdUsuario());
			FacturaDTO facturaDTO = new FacturaDTO(factura.getId(), factura.getTotal(), usuario);
			facturasDTO = List.of(new FacturaDTO[] { facturaDTO });
		}
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
