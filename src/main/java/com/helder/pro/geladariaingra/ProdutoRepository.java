package com.helder.pro.geladariaingra;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helder.pro.geladariaingra.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
