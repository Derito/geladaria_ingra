package com.helder.pro.geladariaingra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helder.pro.geladariaingra.ProdutoRepository;
import com.helder.pro.geladariaingra.domain.Produto;
import com.helder.pro.geladariaingra.util.ControllerUtil;

import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/produto")
@AllArgsConstructor
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ControllerUtil controllerUtil;

	@GetMapping(path = "{id}") 	
	@ApiOperation(value = "Lista o produto por meio do id", response = Produto.class)
	public ResponseEntity<?> obterProfessorPorId(@PathVariable long id){
		return controllerUtil.returnObjectOrNotFound(produtoRepository.findById(id));		
	}
}
