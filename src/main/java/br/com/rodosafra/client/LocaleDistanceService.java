package br.com.rodosafra.client;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.rodosafra.model.Coordenadas;
import br.com.rodosafra.model.LocaleDistance;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LocaleDistanceService {
	
	@Autowired
	ILocaleDistance iLocaleDistance;
	
	@GetMapping("/{co}")
	public ResponseEntity<LocaleDistance> getCoordenadas(@PathVariable String co){
		
		LocaleDistance localeDistance = iLocaleDistance.buscaRotas(co);
		
		return localeDistance != null ? ResponseEntity.ok().body(localeDistance) : ResponseEntity.notFound().build();
	}
	
	@PostMapping(value = "/coordenadas/")
	public LocaleDistance hello(@RequestBody Coordenadas coordenadas) {
		LocaleDistance localeDistance = iLocaleDistance.buscaRotas(coordenadas.getN1()+";"+coordenadas.getN2());
		
		return localeDistance != null ? localeDistance: null;
		
	}

}
