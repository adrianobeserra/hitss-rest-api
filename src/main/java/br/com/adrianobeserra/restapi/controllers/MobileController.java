package br.com.adrianobeserra.restapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adrianobeserra.restapi.documents.Mobile;
import br.com.adrianobeserra.restapi.services.MobileService;

@RestController
@RequestMapping(path = "/claro/mobile")
public class MobileController {

	@Autowired
	private MobileService mobileService;
	
	@GetMapping
	public ResponseEntity<List<Mobile>> listarTodos() {
		return ResponseEntity.ok(this.mobileService.listAll());
	}
	
	@GetMapping(path = "/{code}")
	public ResponseEntity<Mobile> listarPorCodigo(@PathVariable(name = "code") String code) {
		return ResponseEntity.ok(this.mobileService.findByCode(code));
	}
	
	@PostMapping(path = "/")
	public ResponseEntity<Mobile> cadastrar(@RequestBody Mobile mobile) {
		return ResponseEntity.ok(this.mobileService.insert(mobile));
	}
	
	@PutMapping(path = "/{code}")
	public ResponseEntity<Mobile> atualizar(@PathVariable(name = "code") String code, @RequestBody Mobile mobile) {
		mobile.setCode(code);
		return ResponseEntity.ok(this.mobileService.update(mobile));
	}
	
	@DeleteMapping(path = "/{code}")
	public ResponseEntity<Integer> remover(@PathVariable(name = "code") String code) {
		this.mobileService.remove(code);
		return ResponseEntity.ok(1);
	}
}
