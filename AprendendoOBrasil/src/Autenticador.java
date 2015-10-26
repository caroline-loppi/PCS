import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;

public class Autenticador {
	
	Autenticador(){
		
	}
	
	static SecureRandom valorAleatorio = new SecureRandom(); 
	
	public static void main(String[] args){
	
		
	}
	
	public static void gerarSenha(){
		/*cria uma string a partir de um bigInteger uniformemente
	  distribuído baseado no número de bits indicado no parâmetro(30)*/
		String senha = (new BigInteger(30,valorAleatorio).toString(32)); 

		/*Insere senha gerada no arquivoSenha*/
		File arquivoSenha = new File("senha.txt"); 
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoSenha));
			bw.write(senha);
			bw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static boolean validarSenha(String senhaAValidar){
		/*Validador de senha*/
		String token = RecuperaSenha();
		if (senhaAValidar.equals(token) == true)
			return true;
		else 
			return false;
		
	}

	private static String RecuperaSenha(){
		/*Recupera senha do arquivoSenha*/

		String token = null;
		File arquivoSenha = new File("senha.txt"); 
		try{
			BufferedReader br = new BufferedReader(new FileReader(arquivoSenha));
			if((arquivoSenha.length()) != 0){
				token = br.readLine();
			}
			br.close();
		}catch(IOException e){
			System.out.print("Arquivo senha não encontrado. Contate o administrador");
		}
		finally{
			return token;
		}
	
	}
	



}
