package ifpa.appjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ifpa.appjpa.domain.Produto;
import ifpa.appjpa.domain.ProdutosRepo;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoRest {
	@Autowired 
	private ProdutosRepo produtoRepo;
	
	public ProdutoRest() {	}
	
	@GetMapping("/{id}")
	public Produto buscar(@PathVariable Long id) {
		return produtoRepo.findById(id).orElse(new Produto());
	}
	
	@GetMapping
	public List<Produto> pesquisar() {		
		return produtoRepo.findAll();
	}

	@PostMapping
	public Produto salvar(@RequestBody Produto produto) {	
		return produtoRepo.save(produto);
	}

	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		produtoRepo.deleteById(id);
	}

	@PutMapping
	public Produto alterar(@RequestBody Produto produto) {	
		return produtoRepo.save(produto);
	}
}
