package model;

import java.util.Scanner;

import services.RoteiroService;



public class Roteiro {

	private Integer id;
	private String nome;
	private Integer cpf;
	private String cidade;
	private String uf;
	private Double valor;
	private String hotel;
	private String embarque;
	private String desembarque;
	private Integer parcelas;
	private Integer pessoas;
	
	
	
	
	
	public Roteiro(){}
	
	public Roteiro(String nome, Integer cpf, String cidade, String uf, Double valor, String hotel, String embarque,
			String desembarque, Integer parcelas, Integer pessoas) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.cidade = cidade;
		this.uf = uf;
		this.valor = valor;
		this.hotel = hotel;
		this.embarque = embarque;
		this.desembarque = desembarque;
		this.parcelas = parcelas;
		this.pessoas = pessoas;
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
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
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
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public String getEmbarque() {
		return embarque;
	}
	public void setEmbarque(String embarque) {
		this.embarque = embarque;
	}
	public String getDesembarque() {
		return desembarque;
	}
	public void setDesembarque(String desembarque) {
		this.desembarque = desembarque;
	}
	public Integer getParcelas() {
		return parcelas;
	}
	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}
	public Integer getPessoas() {
		return pessoas;
	}
	public void setPessoas(Integer pessoas) {
		this.pessoas = pessoas;
	}
	
	
public void menu () {
		
		Scanner sc = new Scanner (System.in);
		
	    Boolean repetir =  true;
		
		do {
		System.out.println("Digite uma opções abaixo");
		System.out.println("0 - Sair");
		System.out.println("1 - Adicionar Roteiro");
		System.out.println("2 - Atualizar Roteiro");
		System.out.println("3 - Selecionar Roteiro");
		System.out.println("4 - Deletar Roteiro");
		
		int opcao =sc.nextInt();
		RoteiroService roteiroService = new RoteiroService();
		switch(opcao) {
		case 0: 
			repetir = false;
			break;
		case 1:
			roteiroService.save();
			break;
		case 2:
		   roteiroService.update();
			break;
		case 3:
			   roteiroService.select();
				break;
		case 4:
			   roteiroService.delete();
				break;
			
			default:
				System.out.println("Opção invalida!");
				break;
		}
		} while (repetir != false);
	}

	
}


	
