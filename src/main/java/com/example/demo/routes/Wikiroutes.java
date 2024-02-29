package com.example.demo.routes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/grupo26")
public class Wikiroutes {
	@GetMapping("")
	public String home() {
		return "index";
	}
	@GetMapping("/prueba")
	public String losPipolSoloTexto() {
		return "prueba";
	}
    @GetMapping("/prueba2")
	public String losPipolSoloTextICO() {
		return "prueba2";
	}
	@GetMapping("/styles/home")
	public String Csshome() {
		return "home.css";
	}

}

