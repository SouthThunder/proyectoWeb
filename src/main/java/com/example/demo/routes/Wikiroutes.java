package com.example.demo.routes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

}

