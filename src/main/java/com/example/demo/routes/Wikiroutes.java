package com.example.demo.routes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rutas")
public class Wikiroutes {

	@GetMapping("/prueba")
	public String losPipolSoloTexto() {
		return "prueba";
	}
    @GetMapping("/prueba2")
	public String losPipolSoloTextICO() {
		return "prueba2";
	}
}

