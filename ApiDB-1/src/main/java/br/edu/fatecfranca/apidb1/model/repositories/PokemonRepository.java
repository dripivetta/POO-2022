package br.edu.fatecfranca.apidb1.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.apidb1.model.Pokemon;

// a classe interface vai herdar de outra classe interface
// Pokemon é o tipo da tabel e long é o tipo da chave
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
	// esta interface vai herdar os méotodos de CRUD
	// C- reate - insert
	// R- retrieve - select
	// U- update - update
	// D- delete - delete

}
