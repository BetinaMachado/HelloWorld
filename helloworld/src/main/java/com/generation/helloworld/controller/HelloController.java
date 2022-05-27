package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return "<title> Projeto Generation </title>" + "Hello World";
    }
    
    @GetMapping("/bsm")
    public String bsm() {
    	return "<title> Projeto Generation - BSM </title>" + "<b>Habilidades</b> <br>" + "- Trabalho em equipe;<br>- Orientação ao detalhe;<br>- Proatividade;<br>- Comunicação;" + "<br> <b>Mentalidades</b>" + "<br>-Orientação ao Futuro<br>-Responsabilidade Pessoal<br>-Mentalidade de Crescimento<br>-Persistência";
    }
    
    @GetMapping("/obj")
	public String objetivos() {
		return "<title> Projeto Generation - Objetivos </title>" + "<b> Metas de aprendizado para a próxima semana: </b><br>"  + "- Revisar o aprendido na semana passada;<br>- Assistir aos vídeos da plataforma;<br>- Ser mais ativa no Bootcamp e no Discord.";
	}

}
