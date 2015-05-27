package main.java.br.gov.camara;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TipoPublicacaoController {
	
	@RequestMapping("/listar")
	public String listar() {
//		model.addAttribute("name", name);
		return "listar";
	}

}
