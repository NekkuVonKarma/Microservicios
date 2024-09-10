package es.neesis.facturaservice.controller;

import es.neesis.facturaservice.dto.FacturaDTO;
import es.neesis.facturaservice.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FacturaController {
	@Autowired
	private FacturaService facturaService;

	@GetMapping("/facturas")
	public List<FacturaDTO> obtenerFacturas() {
		return facturaService.getFacturas();
	}

	@GetMapping("/facturas/{id}")
	public FacturaDTO obtenerFactura(@PathVariable Integer id) {
		return facturaService.getFactura(id);
	}
}
