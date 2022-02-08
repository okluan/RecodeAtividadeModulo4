package model;

import java.util.Scanner;

import services.ContatoService;
import services.RoteiroService;

public class Contato {

	
	private Integer id;
	private String nome;
	private String email;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String uf;
	private String datadeNascimento;
	private String mensagem;
	
	
	
	public Contato() {}


	public Contato(String nome, String email, String logradouro, String bairro, String cidade, String uf,
			String datadeNascimento, String mensagem) {
		this.nome = nome;
		this.email = email;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.datadeNascimento = datadeNascimento;
		this.mensagem = mensagem;
	}
	

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getLogradouro() {
		return logradouro;
	}



	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getUf() {
		return uf;
	}



	public void setUf(String uf) {
		this.uf = uf;
	}



	public String getDatadeNascimento() {
		return datadeNascimento;
	}



	public void setDatadeNascimento(String datadeNascimento) {
		this.datadeNascimento = datadeNascimento;
	}



	public String getMensagem() {
		return mensagem;
	}



	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}


public void menu () {
		
		Scanner sc = new Scanner (System.in);
		
	    Boolean repetir =  true;
		
		do {
		System.out.println("Digite uma opções abaixo");
		System.out.println("0 - Sair");
		System.out.println("1 - Adicionar Contato");
		System.out.println("2 - Atualizar Contato");
		System.out.println("3 - Selecionar Contato");
		System.out.println("4 - Deletar Contato");
		
		int opcao =sc.nextInt();
		ContatoService contatoService = new ContatoService();
		switch(opcao) {
		case 0: 
			repetir = false;
			break;
		case 1:
			contatoService.save();
			break;
		case 2:
			contatoService.update();
			break;
		case 3:
			contatoService.select();
				break;
		case 4:
			contatoService.delete();
				break;
			
			default:
				System.out.println("Opção invalida!");
				break;
		}
		} while (repetir != false);
	}


	
	
	
	
	
	
	
}
