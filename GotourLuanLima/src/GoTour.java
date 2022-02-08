import java.util.Scanner;

import model.Roteiro;

import model.Contato;
import services.RoteiroService;


public class GoTour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		Boolean repetir =  true;
		do {
		System.out.println("");
		System.out.println("Bem vindo a Go Tour");
		System.out.println("Digite uma opções abaixo");
		System.out.println("0 - Sair");
		System.out.println("1 - Registro de Dados Pessoais e Roteiro ");
		System.out.println("2 - Entrar em Contato");
		
		int opcao =sc.nextInt();
		Roteiro roteiro = new Roteiro();
		Contato contato = new Contato();
		
		switch(opcao) {
		case 0: 
			repetir = false;
			break;
		case 1:
			roteiro.menu();
			break;
		case 2:
			contato.menu();
			break;
			
			default:
				System.out.println("Opção invalida!");
				break;
		}
		
		
		
	} while (repetir);

}
};
