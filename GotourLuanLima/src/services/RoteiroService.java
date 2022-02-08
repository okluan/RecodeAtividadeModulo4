package services;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import conector.ConexaocomBancodeDados;
import model.Roteiro;

public class RoteiroService {
	

	public void save() {
		Scanner sc = new Scanner (System.in);
		
		Roteiro roteiro = new Roteiro();
		
		System.out.println("Digite seu nome:");
		roteiro.setNome(sc.nextLine());
		
		System.out.println("Digite seu CPF (inteiro):");
		roteiro.setCpf(sc.nextInt());
		
		System.out.println("Digite o nome da cidade:");
		sc.nextLine();
		roteiro.setCidade(sc.nextLine());
		
		System.out.println("Digite a UF:");
		roteiro.setUf(sc.nextLine());
		
		System.out.println("Digite o valor do carro (double):");
		roteiro.setValor(sc.nextDouble());
		
		System.out.println("Digite o nome do hotel:");
		sc.nextLine();
		roteiro.setHotel(sc.nextLine());
		
		System.out.println("Digite a data de embarque (string 17/08/2018):");
		roteiro.setEmbarque(sc.nextLine());
		
		System.out.println("Digite a data de desembarque (string 17/08/2018):");
		roteiro.setDesembarque(sc.nextLine());
		
		System.out.println("Digite o número de parcelas (inteiro):");
		roteiro.setParcelas(sc.nextInt());
		
		System.out.println("Digite o número de pessoas (inteiro):");
		roteiro.setPessoas(sc.nextInt());
		
		
		
		
		
		String sql ="INSERT INTO Roteiro (nome, cpf, cidade, uf, valor, hotel, embarque, desembarque, parcelas, pessoas ) VALUES(?,?,?, ?, ?, ?,?,?,?,?)";
	
		Connection conn = null;
		PreparedStatement  pstm = null;
		
		try {
			conn = ConexaocomBancodeDados.createConnection();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, roteiro.getNome());	
			pstm.setInt(2, roteiro.getCpf());
			pstm.setString(3, roteiro.getCidade());
			pstm.setString(4, roteiro.getUf());
			pstm.setDouble(5, roteiro.getValor());
			pstm.setString(6, roteiro.getHotel());
			pstm.setString(7, roteiro.getEmbarque());
			pstm.setString(8, roteiro.getDesembarque());
			pstm.setInt(9, roteiro.getParcelas());
			pstm.setInt(10, roteiro.getPessoas());
			
			pstm.execute();
			
			System.out.println();
			System.out.println("Roteiro inserido com sucesso");
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
			
			Roteiro roteiro = new Roteiro();
			
			System.out.println("Digite o ID do Roteiro (inteiro):");
			roteiro.setId(sc.nextInt());
			
			System.out.println("Digite seu nome:");
			sc.nextLine();
			roteiro.setNome(sc.nextLine());
			
			System.out.println("Digite seu CPF (inteiro):");
			roteiro.setCpf(sc.nextInt());
			
			System.out.println("Digite o nome da cidade:");
			sc.nextLine();
			roteiro.setCidade(sc.nextLine());
			
			System.out.println("Digite a UF:");
			roteiro.setUf(sc.nextLine());
			
			System.out.println("Digite o valor do carro (double): ");
			roteiro.setValor(sc.nextDouble());
			
			
			System.out.println("Digite o nome do hotel:");
			sc.nextLine();
			roteiro.setHotel(sc.nextLine());
			
			System.out.println("Digite a data de embarque (string 17/08/2018):");
			roteiro.setEmbarque(sc.nextLine());
			
			System.out.println("Digite a data de desembarque (string 17/08/2018):");
			roteiro.setDesembarque(sc.nextLine());
			
			System.out.println("Digite o número de parcelas");
			roteiro.setParcelas(sc.nextInt());
			
			System.out.println("Digite o número de pessoas");
			roteiro.setPessoas(sc.nextInt());
			
			
			String sql ="UPDATE Roteiro set nome = ?, cpf = ?, cidade = ?, uf = ?, valor = ?, hotel = ?, embarque = ?, desembarque = ?, parcelas = ?, pessoas = ? where id = ?";
		
			Connection conn = null;
			PreparedStatement  pstm = null;
			
			try {
				conn = ConexaocomBancodeDados.createConnection();
				pstm = conn.prepareStatement(sql);
				
				pstm.setString(1, roteiro.getNome());	
				pstm.setInt(2, roteiro.getCpf());
				pstm.setString(3, roteiro.getCidade());
				pstm.setString(4, roteiro.getUf());
				pstm.setDouble(5, roteiro.getValor());
				pstm.setString(6, roteiro.getHotel());
				pstm.setString(7, roteiro.getEmbarque());
				pstm.setString(8, roteiro.getDesembarque());
				pstm.setInt(9, roteiro.getParcelas());
				pstm.setInt(10, roteiro.getPessoas());
				pstm.setInt(11, roteiro.getId());
				
				pstm.execute();
				
				System.out.println();
				System.out.println("Atualizado com sucesso");
				System.out.println();
				conn.close();
				pstm.close();
			}
			catch(Exception ex){
				System.out.println(ex.getMessage());
			}
			};
		
		
		
		public void select(){
			
			Connection conn = null;
			PreparedStatement  pstm = null;
			ResultSet rs = null;
			
			try {
				conn = ConexaocomBancodeDados.createConnection();
				pstm = conn.prepareStatement("SELECT * FROM Roteiro");
				rs = pstm.executeQuery();
				while (rs.next()) {
					System.out.println("");
					System.out.println("========");
					System.out.println("ID: "+ rs.getInt("id"));
					System.out.println("NOME: "+ rs.getString("nome"));
					System.out.println("CPF: "+ rs.getInt("cpf"));
					System.out.println("CIDADE: "+ rs.getString("cidade"));
					System.out.println("UF: "+ rs.getString("uf"));
					System.out.println("VALOR: "+ rs.getDouble("valor"));
					System.out.println("HOTEL: "+ rs.getString("hotel"));
					System.out.println("EMBARQUE: "+ rs.getString("embarque"));
					System.out.println("DESEMBARQUE: "+ rs.getString("desembarque"));
					System.out.println("PARCELAS: "+ rs.getInt("parcelas"));
					System.out.println("PESSOAS: "+ rs.getInt("pessoas"));
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
				
				
				System.out.println("Digite o ID do Roteiro:");
				int id = sc.nextInt();
				
				
				
				
				String sql ="DELETE FROM Roteiro where id = ?";
			
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
	
