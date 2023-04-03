package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //anotação diz que essa classe é um controller da API REST
@RequestMapping("/hello") //Anotação serve para essa classe responder ao localhost:8080/hello
public class HelloController {
	
	@GetMapping // anotação serve para pegar o Mapping que esta anotado em cima da classe
	public String olaMundo() {
		return "Hello word!";
	}
}
