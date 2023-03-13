package br.com.guilh.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.guilh.helloworld.model.entities.BSM;
import br.com.guilh.helloworld.model.entities.ObjetivoPessoal;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}

	@GetMapping("/lista-bsm")
	public List<BSM> listaBSM() {
		BSM orientacaoAoFuturo = new BSM("Orientacao ao Futuro");
		BSM responsabilidadePessoal = new BSM("Responsabilidade Pessoal");
		BSM mentalidadeDeCrescimento = new BSM("Mentailidade de Crescimento");
		BSM persistencia = new BSM("Persistencia");
		BSM trabalhoEmEquipe = new BSM("Trabalho em Equipe");
		BSM atencaoAosDetalhes = new BSM("Atencao aos Detalhes");
		BSM proatividade = new BSM("Proatividade");
		BSM comunicacao = new BSM("Comunicacao");

		List<BSM> listaBSM = new ArrayList<>();
		listaBSM.add(orientacaoAoFuturo);
		listaBSM.add(responsabilidadePessoal);
		listaBSM.add(mentalidadeDeCrescimento);
		listaBSM.add(persistencia);
		listaBSM.add(trabalhoEmEquipe);
		listaBSM.add(atencaoAosDetalhes);
		listaBSM.add(proatividade);
		listaBSM.add(comunicacao);

		return listaBSM;
	}

	@GetMapping("/lista-objetivos-pessoais")
	public List<ObjetivoPessoal> listaObjetivosPessoais(){
		ObjetivoPessoal ob1 = new ObjetivoPessoal("Entender o conteito de REST");
		ObjetivoPessoal ob2 = new ObjetivoPessoal("Dominar CRUD basico");
		ObjetivoPessoal ob3 = new ObjetivoPessoal("Dominar todo o conceito dos metodos HTTP");
		
		List<ObjetivoPessoal> objetivos = new ArrayList<>();
		objetivos.add(ob1);
		objetivos.add(ob2);
		objetivos.add(ob3);
		return objetivos;
	}

}
