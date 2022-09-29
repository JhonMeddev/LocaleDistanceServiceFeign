package br.com.rodosafra.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.rodosafra.model.LocaleDistance;

@FeignClient(url="https://router.project-osrm.org/route/v1/driving/", name = "routerProject")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public interface ILocaleDistance {
	
	@GetMapping("{co}")
	public LocaleDistance buscaRotas(@PathVariable("co") String co);

}
