package trabajoJuegoDeTronos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import trabajoJuegoDeTronos.model.Region;
import trabajoJuegoDeTronos.service.IRegionService;

@Controller
public class HomeController {
	
	@RequestMapping(value= "/home", method = RequestMethod.GET)
	public String HomePage() {
		return "home";
	}
	
	@Autowired
	private IRegionService region;
	@RequestMapping(value= "/listarRegiones", method = RequestMethod.GET)
	public String ListarRegiones(Model modelo) {
		List<Region> regiones= region.listarRegiones();
		modelo.addAttribute("regiones",regiones);
		return "listarRegiones";
	}
}
