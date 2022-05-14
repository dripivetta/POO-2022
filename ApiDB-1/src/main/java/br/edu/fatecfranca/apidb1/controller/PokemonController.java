package br.edu.fatecfranca.apidb1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.apidb1.model.Pokemon;
import br.edu.fatecfranca.apidb1.model.repositories.PokemonRepository;

//informa que a classe responde por requisições restfull
@RestController
public class PokemonController {
	
	// característica principal do Spring
	// ingeção de dependências
	// objeto pode utilizar métodos de sua interface sem ser instanciado
	
	@Autowired
	PokemonRepository injecao;
	
	// método para consultar os pokemons na rota / pokemon
	@GetMapping ("/pokemon")
	public List<Pokemon> get() {
		// select * from pokemon
		return injecao.findAll ();
		
	}
}
