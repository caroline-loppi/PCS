import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.security.SecureRandom;
public class Menu {
	static SecureRandom valorAleatorio = new SecureRandom(); //gera um valor aleat�rio n�o determin�stico
	private static Estado[] vetorDeEstados = new Estado[10];
	
	//A implementar: se��o pontos turisticos;
	//A implementar: salva resultados incrementalmente;
	
	
	
	
	public static void main(String[] args) {
		
		String token = null;
		Scanner input = new Scanner(System.in);

		/*cria uma string a partir de um bigInteger uniformemente
		  distribu�do baseado no n�mero de bits indicado no par�metro(30)*/
		String senha = (new BigInteger(30,valorAleatorio).toString(32)); 
		
		//Insere senha gerada no arquivoSenha
		File arquivoSenha = new File("senha.txt"); 
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoSenha));
			bw.write(senha);
			bw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		

		
		System.out.println("Aprendendo o Brasil\n");
		System.out.println(" Pressione a op��o desejada: \n 1: Jogador \n 2: Avaliador");
		
		//implementar: tratamento da entrada para sele��o de perfil
	//	try {
			int opcao = input.nextInt();

			if(opcao == 1){ 
				//perfil jogador selecionado
				//.*.*JOGA ISSO NUM METOTO
				System.out.print("Insira seu nome:");
				String nome = input.next();
				InicializaEstados();	
				System.out.print("\n\n\n\n\n\n\n");
				System.out.println("Ol� " + nome + "!" + "\n\n Escolha a op��o desejada:\n ");
				System.out.println("1. Capital ---> Estado\n2. Bandeira ---> Estado\n3. Visualizar Pontos Tur�sticos");
				int areaJogo = input.nextInt();  //A implementar: valida��o da entrada
				int pontosCapital, pontosBandeira;
				switch(areaJogo){
					case(1):
						pontosCapital = IniciarCapitalEstado(0);
						System.out.print("pontos!!!!" + pontosCapital);
						
						break;
					case(2):
						//pontosBandeira = IniciarBandeiraEstado();
						break;
					case(3):
						System.out.print("Op��o ainda n�o implementada nesta vers�o");
						break;
					default:
						System.out.println("Op��o inv�lida. Tente novamente");
						main(args);
				} //A implementar: sair do jogo/se��o
			}
			
			else if(opcao == 2){
				//perfil avaliador selecionado
				System.out.println("\n\nAvaliador? Digite sua senha");
				String senhaParaValidar = input.next();
				
				boolean autenticado = ValidaSenha(senhaParaValidar);
				if(autenticado == true){
					ListaResultados();
				}
				else{
					System.out.println("Usu�rio n�o autenticado. Tente novamente");
					main(args);
				}
			}
			
		/*}catch(Exception e){
			System.out.println("Valor incorreto. Tente novamente");
			main(args);
		}*/
		
		
		
		
		
		
		

		
		
		
		
		//tela inicial escolher se � jogador e botar nome ou avaliador e botar senha//fazer verifica��o de senha e salvar nome do estudante
		//se senha ok -> puxa file de resultados j� criado
		//se nome -> abre tela com 3 op��es de escolha terceira colocar como nao ainda resto -> mode DEMO
		//se op��o 1 -> capital estado
		//se op��o 2 -> bandeira estado
		//abre tela de se��o do jogo
		//capital estado -> gera lista de nomes de estados com n�mero correspondente ou digita sigla do estado e, depois de entrada a sigla gera 3 valores, 
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!puxa do vetor de estados????!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//o jogo em si
		//mostrar lista de 8 estados
		//antes de tudo escolher se��o

		
		
		//juntar tudo
		//gerar senha, salvar num arquivo, criar avaliador e sempre que tentar acessar esta �rea, verificar no arquivo se senha atribuida a ele � a mesma do file
		
	}
	
	public static boolean ValidaSenha(String senhaAValidar){
		//Validador de senha
		String token = RecuperaSenha();
		if (senhaAValidar.equals(token) == true)
			return true;
		else 
			return false;
		
	}
	
	private static String RecuperaSenha(){
		//Recupera senha do arquivoSenha

		String token = null;
		File arquivoSenha = new File("senha.txt"); 
		try{
			BufferedReader br = new BufferedReader(new FileReader(arquivoSenha));
			if((arquivoSenha.length()) != 0){
				token = br.readLine();
			}
			br.close();
		}catch(IOException e){
			System.out.print("Arquivo senha n�o encontrado. Contate o administrador");
		}
		finally{
			return token;
		}
	
	}
	
	private static void ListaResultados(){
		//Recupera resultados do arquivoResultados para usu�rio autenticado
		File arquivoResultados = new File("resultados.txt");
		try{
			BufferedReader br = new BufferedReader(new FileReader(arquivoResultados));
			String conteudo = null;
			while((conteudo = br.readLine()) != null){
				//percorre linhas do arquivo imprimindo conte�do
				System.out.println(conteudo);
			}
			br.close();
		}catch(IOException e){
			e.printStackTrace();
			}
	}
	
	private static void InicializaEstados(){
		/*inser��o de 10 estados - est�gio prot�tipo*/
		Capital RJCapital = new Capital("Rio de Janeiro");
		Bandeira RJBandeira = new Bandeira("RECTE REMPUBLICAM GERERE");
		Estado RJ = new Estado("RJ",RJCapital, RJBandeira );
		vetorDeEstados[0] = RJ;
		
		Capital MGCapital = new Capital("Belo Horizonte");
		Bandeira MGBandeira = new Bandeira("LIBERTAS QUAE SERA TAMEM");
		Estado MG = new Estado("MG", MGCapital, MGBandeira);
		vetorDeEstados[1] = MG;
		
		Capital SPCapital = new Capital("S�o Paulo");
		Bandeira SPBandeira = new Bandeira("PRO BRASILIA FIANT EXIMIA");
		Estado SP = new Estado("SP", SPCapital, SPBandeira);
		vetorDeEstados[2] = SP;

		Capital ESCapital = new Capital("Vit�ria");
		Bandeira ESBandeira = new Bandeira("TRABALHA E CONFIA");
		Estado ES = new Estado("ES", ESCapital, ESBandeira);
		vetorDeEstados[3] = ES;

		Capital TOCapital = new Capital("Palmas");
		Bandeira TOBandeira = new Bandeira("CO YVY ORE RETAMA");
		Estado  TO = new Estado("TO", TOCapital, TOBandeira);
		vetorDeEstados[4] = TO;

		Capital BACapital = new Capital("Salvador");
		Bandeira BABandeira = new Bandeira("PER ARDUA SURGO");
		Estado BA = new Estado("BA", BACapital, BABandeira);
		vetorDeEstados[5] = BA;

		Capital DFCapital = new Capital("Bras�lia");
		Bandeira DFBandeira = new Bandeira("VENTVRIS VENTIS");
		Estado DF = new Estado("DF", DFCapital, DFBandeira);
		vetorDeEstados[6] = DF;

		Capital PACapital = new Capital("Bel�m");
		Bandeira PABandeira = new Bandeira("SUB LEGE PROGREDIAMUR");
		Estado PA = new Estado("PA", PACapital, PABandeira);
		vetorDeEstados[7] = PA;

		Capital ACCapital = new Capital("Rio Branco");
		Bandeira ACBandeira = new Bandeira("NEC LUCEO PLURIBUS IMPAR");
		Estado AC = new Estado("AC", ACCapital, ACBandeira);
		vetorDeEstados[8] = AC;

		Capital PICapital = new Capital("Teresina");
		Bandeira PIBandeira = new Bandeira("IMPAVIDUM FERIENT RUINAE");
		Estado PI = new Estado("PI", PICapital, PIBandeira);
		vetorDeEstados[9] = PI;

	}
	public static int[] geraValoresNaoRepetidos(int quantidade, int maxValor){
		int[] evitaRedundancia = new int[quantidade];
		int posic = 0;
		int flag = 0;
		Random r = new Random();
		while(posic<quantidade-1){
			int numeroAleatorio = r.nextInt(maxValor+1) + 0;
			for(int i=0; i<posic;i++){
				if(evitaRedundancia[i] == numeroAleatorio){
					flag = 1;
					break;
				}
			}
			if (flag==0){
				evitaRedundancia[posic] = numeroAleatorio;
				posic +=1;
			}			
		}
		return evitaRedundancia;

	}

	

	public static int IniciarCapitalEstado(int pontos){
		Scanner input = new Scanner(System.in);
		System.out.print("Escolha o estado\n");
		Estado[] estadosSelecionados = new Estado[5];
		int[] auxiliar = geraValoresNaoRepetidos(5, 9);
		for(int i=0;i<5;i++){
			estadosSelecionados[i] = vetorDeEstados[auxiliar[i]];
			System.out.println(i + ". " + vetorDeEstados[auxiliar[i]].getNomeEstado());
		}
		int estadoEscolhido = input.nextInt();
		System.out.println("Estado: " + estadosSelecionados[estadoEscolhido].getNomeEstado() );
		System.out.println("Escolha a capital do " + estadosSelecionados[estadoEscolhido].getNomeEstado() + ": " );
		
		int EA1; //estado aleat�rio
		int EA2;
		//seleciona as capitais aleat�rias para op��es
		int[] aux = new int[3]; 
		aux = geraValoresNaoRepetidos(3, 4);
		System.out.print("!!!AUX0 " + aux[0] + "\n" +"AUX1 " + aux[1] + "\nAUX2 " + aux[2]  );
		System.out.println("\n!!!estado escoligid" + estadoEscolhido);
		if(aux[0] != estadoEscolhido) {
			EA1 = aux[0];
			if(aux[1] != estadoEscolhido){
				EA2 = aux[1];
			}else{
				EA2 = aux[2];
			}
		}else{
			EA1 = aux[1];
			EA2 = aux[2];
		}
		
		System.out.print("1. " + estadosSelecionados[estadoEscolhido].getCapitalEstado() );
		System.out.print("2. " + estadosSelecionados[EA1].getCapitalEstado() );
		System.out.print("3. " + estadosSelecionados[EA2].getCapitalEstado() );
		int resposta = input.nextInt();
		if(resposta == 1) {
			System.out.print("Resposta Correta!");
			pontos+=10;
		}
		else System.out.print("Resposta Incorreta :(");
		
		/*Imprime de forma aleatoria as tr�s op��es de capitais baseado no valor de determinaOrdem
		
		Random r = new Random();
		int determinaOrdem = r.nextInt(3) + 0;
		if(determinaOrdem == 0){
			System.out.print("1. " + estadosSelecionados[estadoEscolhido].getCapitalEstado() );
			System.out.print("2. " + estadosSelecionados[EA1].getCapitalEstado() );
			System.out.print("3. " + estadosSelecionados[EA2].getCapitalEstado() );
			int resposta = input.nextInt();
			if(resposta == 1) {
				System.out.print("Resposta Correta!");
				pontos+=10;
			}
			else System.out.print("Resposta Incorreta :(");

		}
		else if(determinaOrdem==1){
			System.out.print("1. " + estadosSelecionados[EA2].getCapitalEstado() );
			System.out.print("2. " + estadosSelecionados[estadoEscolhido].getCapitalEstado() );
			System.out.print("3. " + estadosSelecionados[EA1].getCapitalEstado() );
			int resposta = input.nextInt();
			if(resposta == 2) {
				System.out.print("Resposta Correta!");
				pontos+=10;
			}
			else System.out.print("Resposta Incorreta :(");


		}		
		else if(determinaOrdem==2){
			System.out.print("1. " + estadosSelecionados[EA1].getCapitalEstado() );
			System.out.print("2. " + estadosSelecionados[EA2].getCapitalEstado() );
			System.out.print("3. " + estadosSelecionados[estadoEscolhido].getCapitalEstado() );
			int resposta = input.nextInt();
			if(resposta == 3) {
				System.out.print("Resposta Correta!");
				pontos+=10;
			}
			else System.out.print("Resposta Incorreta :(");

		}	
*/
		System.out.print("Continuar? \n0: n�o\n1:sim");
		int continua = input.nextInt();
		if(continua == 0){
			return pontos;
		}
		if(continua == 1)
			IniciarCapitalEstado(pontos);
		
		return 0;
	}
	

}
