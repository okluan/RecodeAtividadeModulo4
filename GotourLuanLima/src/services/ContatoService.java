package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import conector.ConexaocomBancodeDados;
import model.Contato;
import model.Roteiro;

public class ContatoService {

	public void save() {
		Scanner sc = new Scanner (System.in);
		
		Contato contato = new Contato();
		
		System.out.println("Digite seu nome:");
		contato.setNome(sc.nextLine());
	
		System.out.println("Digite seu email:");
		contato.setEmail(sc.nextLine());
		
		
		System.out.println("Digite o bairro:");
		contato.setBairro(sc.nextLine());
		
		System.out.println("Digite o logradouro:");
		contato.setLogradouro(sc.nextLine());
		
		System.out.println("Digite a cidade:");
		contato.setCidade(sc.nextLine());
		
		System.out.println("Digite a UF:");
		contato.setUf(sc.nextLine());
		
		System.out.println("Digite a data de nascimento (string 17/08/2018):");
		contato.setDatadeNascimento(sc.nextLine());
		
		System.out.println("Digite a mensagem:");
		contato.setMensagem(sc.nextLine());
		

		
		String sql ="INSERT INTO Contato (nome, email, logradouro, bairro, cidade, uf, datadeNascimento, mensagem ) VALUES(?,?,?, ?, ?, ?,?,?)";
	
		Connection conn = null;
		PreparedStatement  pstm = null;
		
		try {
			conn = ConexaocomBancodeDados.createConnection();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, contato.getNome());
			pstm.setString(2, contato.getEmail());
			pstm.setString(3, contato.getLogradouro());
			pstm.setString(4, contato.getBairro());
			pstm.setString(5, contato.getCidade());
			pstm.setString(6, contato.getUf());
			pstm.setString(7, contato.getDatadeNascimento());
			pstm.setString(8, contato.getMensagem());
			
			
			pstm.execute();
			
			System.out.println();
			System.out.println("Contato inserido com sucesso");
			System.out.println();
			
			conn.close();
			pstm.close();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		};
		
		
		
		public void update(){
			
			Scanner sc = new Scanner (System.in);
			
			Contato contato = new Contato();
			
			System.out.println("Digite o ID do contato (inteiro):");
			contato.setId(sc.nextInt());
			
			System.out.println("Digite seu nome:");
			sc.nextLine();
			contato.setNome(sc.nextLine());
		
			System.out.println("Digite seu email:");
			contato.setEmail(sc.nextLine());
			
			System.out.println("Digite seu CPF (inteiro):");
			contato.setLogradouro(sc.nextLine());
			
			System.out.println("Digite o bairro:");
			contato.setBairro(sc.nextLine());
			
			System.out.println("Digite a cidade:");
			contato.setCidade(sc.nextLine());
			
			System.out.println("Digite a UF:");
			contato.setUf(sc.nextLine());
			
			System.out.println("Digite a data de nascimento (string 17/08/2018):");
			contato.setDatadeNascimento(sc.nextLine());
			
			System.out.println("Digite a mensagem:");
			contato.setMensagem(sc.nextLine());
			

			
			String sql ="UPDATE Contato set nome = ?, email = ?, logradouro = ?, bairro = ?, cidade = ?, uf = ?, datadeNascimento = ?, mensagem = ? where id = ?";
		
			Connection conn = null;
			PreparedStatement  pstm = null;
			
			try {
				conn = ConexaocomBancodeDados.createConnection();
				pstm = conn.prepareStatement(sql);
				
				pstm.setString(1, contato.getNome());
				pstm.setString(2, contato.getEmail());
				pstm.setString(3, contato.getLogradouro());
				pstm.setString(4, contato.getBairro());
				pstm.setString(5, contato.getCidade());
				pstm.setString(6, contato.getUf());
				pstm.setString(7, contato.getDatadeNascimento());
				pstm.setString(8, contato.getMensagem());
				pstm.setInt(9, contato.getId());
				
				
				
				pstm.execute();
				
				System.out.println();
				System.out.println("Contato atualizado com sucesso");
				System.out.println();
				
				conn.close();
				pstm.close();
			}
			catch(Exception ex){
				System.out.println(ex.getMessage());
			}
			
			
		}
		
		
		
public void select(){
			
			Connection conn = null;
			PreparedStatement  pstm = null;
			ResultSet rs = null;
			
			try {
				conn = ConexaocomBancodeDados.createConnection();
				pstm = conn.prepareStatement("SELECT * FROM Contato");
				rs = pstm.executeQuery();
				while (rs.next()) {
					System.out.println("");
					System.out.println("========");
					System.out.println("ID: "+ rs.getInt("id"));
					System.out.println("NOME: "+ rs.getString("nome"));
					System.out.println("EMAIL: "+ rs.getString("email"));
					System.out.println("LOGRADOURO: "+ rs.getString("logradouro"));
					System.out.println("BAIRRO: "+ rs.getString("bairro"));
					System.out.println("CIDADE: "+ rs.getString("cidade"));
					System.out.println("UF: "+ rs.getString("uf"));
					System.out.println("DATA DE NASCIMENTO: "+ rs.getString("datadeNascimento"));
					System.out.println("MENSAGEM: "+ rs.getString("mensagem"));
					
					System.out.println("");
				}
				
				System.out.println();
				System.out.println("Seleção realizada com sucesso");
				System.out.println();
				
	            
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());}}

public void delete(){
	
	Scanner sc = new Scanner (System.in);
	
	
	System.out.println("Digite o ID do Contato:");
	int id = sc.nextInt();
	
	
	
	
	String sql ="DELETE FROM Contato where id = ?";

	Connection conn = null;
	PreparedStatement  pstm = null;
	
	try {
		conn = ConexaocomBancodeDados.createConnection();
		pstm = conn.prepareStatement(sql);
		
		pstm.setInt(1, id);	
		
		
		pstm.execute();
		
		System.out.println();
		System.out.println("Item deletado com sucesso");
		System.out.println();
		conn.close();
		pstm.close();
	}
	catch(Exception ex){
		System.out.println(ex.getMessage());
	}
	};
		
}
