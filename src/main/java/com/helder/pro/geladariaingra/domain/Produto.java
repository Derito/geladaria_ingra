package com.helder.pro.geladariaingra.domain;


public class Produto extends AbstractEntity{
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String quantidade;
	private String preco;
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	

}
