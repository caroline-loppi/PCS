import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.security.SecureRandom;

public class Menu {
<<<<<<< Updated upstream
	static SecureRandom valorAleatorio = new SecureRandom(); //gera um valor aleatório não determinístico
	private static Estado[] vetorDeEstados = new Estado[10];
=======
	/*gera um valor aleat�rio n�o determin�stico*/
	static int pontos=0;
	static int idBandeira = 0;
	private static List <Estado> estados;
>>>>>>> Stashed changes
	
	//A implementar: seção pontos turisticos;
	//A implementar: salva resultados incrementalmente;
	//A implementar: check ao lado do estado j� corretamente correlacionado com capital
	//A implementar: tratamento da entrada para sele��o de perfil
	//A implementar: sair do jogo/se��o
	
	
	public static void main(String[] args) {
		estados = new ArrayList <Estado>();
		Scanner input = new Scanner(System.in);
<<<<<<< Updated upstream

		/*cria uma string a partir de um bigInteger uniformemente
		  distribuído baseado no número de bits indicado no parâmetro(30)*/
		String senha = (new BigInteger(30,valorAleatorio).toString(32)); 
		
		//Insere senha gerada no arquivoSenha
		File arquivoSenha = new File("senha.txt"); 
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoSenha));
			bw.write(senha);
			bw.close();
		}catch(IOException e){
			e.printStackTrace();
=======
		Autenticador sessao = new Autenticador();
		sessao.gerarSenha();
		Engine engine = new Engine();

		System.out.println("\nAprendendo o Brasil\n");
		System.out.println(" Pressione a op��o desejada: \n 1: Jogador \n 2: Avaliador");			
		int opcao = input.nextInt();

		if(opcao == 1){ 
			/*perfil jogador selecionado*/
			System.out.print("Insira seu nome:");
			String nome = input.next();
			inicializarEstados();	
			
			System.out.print("\n\n\n\n\n\n\n");
			System.out.println("Ol� " + nome + "!" + "\n\n Escolha a op��o desejada:\n ");
			System.out.println("1. Capital ---> Estado\n2. Bandeira ---> Estado\n3. Visualizar Pontos Tur�sticos");
			
			int areaJogo = input.nextInt(); 
			int pontosCapital, pontosBandeira;
			pontos = 0;
			switch(areaJogo){
			case(1):
				pontosCapital = engine.iniciarCapitalEstado(pontos, estados);
				System.out.print("Sua pontua��o: " + pontosCapital);
				main(args);
				break;
			case(2):
				pontosBandeira = engine.iniciarBandeiraEstado(pontos, 0, estados);
				System.out.print("Sua pontua��o: " + pontosBandeira);	
				main(args);
				break;
			case(3):
				engine.carregaPontosTuristicos(estados);
				main(args);
				break;
			default:
				System.out.println("Op��o inv�lida. Tente novamente");
				main(args);
			} 
>>>>>>> Stashed changes
		}

<<<<<<< Updated upstream
		
		System.out.println("Aprendendo o Brasil\n");
		System.out.println(" Pressione a opção desejada: \n 1: Jogador \n 2: Avaliador");
		
		//implementar: tratamento da entrada para seleção de perfil
	//	try {
			int opcao = input.nextInt();

			if(opcao == 1){ 
				//perfil jogador selecionado
				//Incluir num método
				System.out.print("Insira seu nome:");
				String nome = input.next();
				InicializaEstados();	
				System.out.print("\n\n\n\n\n\n\n");
				System.out.println("Olá " + nome + "!" + "\n\n Escolha a opção desejada:\n ");
				System.out.println("1. Capital ---> Estado\n2. Bandeira ---> Estado\n3. Visualizar Pontos Turísticos");
				int areaJogo = input.nextInt();  //A implementar: validação da entrada
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
						System.out.print("Opção ainda não implementada nesta versão");
						break;
					default:
						System.out.println("Opção inválida. Tente novamente");
						main(args);
				} //A implementar: sair do jogo/seção
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
					System.out.println("Usuário não autenticado. Tente novamente");
					main(args);
				}
			}
			
		/*}catch(Exception e){
			System.out.println("Valor incorreto. Tente novamente");
			main(args);
		}*/
		
		
		
		
		
		
		

		
		
		
		
		//tela inicial escolher se é jogador e botar nome ou avaliador e botar senha//fazer verificação de senha e salvar nome do estudante
		//se senha ok -> puxa file de resultados já criado
		//se nome -> abre tela com 3 opções de escolha terceira colocar como nao ainda resto -> mode DEMO
		//se opção 1 -> capital estado
		//se opção 2 -> bandeira estado
		//abre tela de seção do jogo
		//capital estado -> gera lista de nomes de estados com número correspondente ou digita sigla do estado e, depois de entrada a sigla gera 3 valores, 
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!puxa do vetor de estados????!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//o jogo em si
		//mostrar lista de 8 estados
		//antes de tudo escolher seção

		
		
		//juntar tudo
		//gerar senha, salvar num arquivo, criar avaliador e sempre que tentar acessar esta área, verificar no arquivo se senha atribuida a ele é a mesma do file
		
=======
		else if(opcao == 2){
			/*perfil avaliador selecionado*/
			System.out.println("\n\nAvaliador? Digite sua senha");
			String senhaParaValidar = input.next();

			boolean autenticado = sessao.validarSenha(senhaParaValidar);
			if(autenticado == true){
				ListaResultados();
			}
			else{
				System.out.println("Usu�rio n�o autenticado. Tente novamente");
				main(args);
			}
			System.out.println("Sair? Digite 1");
			int sair = input.nextInt();
			if(sair == 1){
				main(args);
			}
			
		}		
>>>>>>> Stashed changes
	}
	
	
<<<<<<< Updated upstream
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
			System.out.print("Arquivo senha não encontrado. Contate o administrador");
		}
		finally{
			return token;
		}
=======
>>>>>>> Stashed changes
	
	
	
	private static void ListaResultados(){
<<<<<<< Updated upstream
		//Recupera resultados do arquivoResultados para usuário autenticado
=======
		/*Recupera resultados do arquivoResultados para usu�rio autenticado*/
>>>>>>> Stashed changes
		File arquivoResultados = new File("resultados.txt");
		try{
			BufferedReader br = new BufferedReader(new FileReader(arquivoResultados));
			String conteudo = null;
			while((conteudo = br.readLine()) != null){
<<<<<<< Updated upstream
				//percorre linhas do arquivo imprimindo conteúdo
=======
				/*percorre linhas do arquivo imprimindo conte�do*/
>>>>>>> Stashed changes
				System.out.println(conteudo);
			}
			br.close();
		}catch(IOException e){
			e.printStackTrace();
			}
	}
	
<<<<<<< Updated upstream
	private static void InicializaEstados(){
		/*inserção de 10 estados - estágio protótipo*/
		Capital RJCapital = new Capital("Rio de Janeiro");
		Bandeira RJBandeira = new Bandeira("RECTE REMPUBLICAM GERERE");
		Estado RJ = new Estado("RJ",RJCapital, RJBandeira );
		vetorDeEstados[0] = RJ;
		
		Capital MGCapital = new Capital("Belo Horizonte");
		Bandeira MGBandeira = new Bandeira("LIBERTAS QUAE SERA TAMEM");
		Estado MG = new Estado("MG", MGCapital, MGBandeira);
		vetorDeEstados[1] = MG;
		
		Capital SPCapital = new Capital("São Paulo");
		Bandeira SPBandeira = new Bandeira("PRO BRASILIA FIANT EXIMIA");
		Estado SP = new Estado("SP", SPCapital, SPBandeira);
		vetorDeEstados[2] = SP;

		Capital ESCapital = new Capital("Vitória");
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

		Capital DFCapital = new Capital("Brasília");
		Bandeira DFBandeira = new Bandeira("VENTVRIS VENTIS");
		Estado DF = new Estado("DF", DFCapital, DFBandeira);
		vetorDeEstados[6] = DF;

		Capital PACapital = new Capital("Belém");
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

=======
	private static void inicializarEstados(){

		//this.estados = new ArrayList <Estado>();
		Estado RJ = new Estado("RJ","Rio de Janeiro", "RECTE REMPUBLICAM GERERE" );
		Estado MG = new Estado("MG", "Belo Horizonte", "LIBERTAS QUAE SERA TAMEM");		
		Estado SP = new Estado("SP", "S�o Paulo", "PRO BRASILIA FIANT EXIMIA");
		Estado ES = new Estado("ES", "Vit�ria", "TRABALHA E CONFIA");		
		Estado TO = new Estado("TO", "Palmas", "CO YVY ORE RETAMA");				
		Estado BA = new Estado("BA","Salvador", "PER ARDUA SURGO");
		Estado DF = new Estado("DF", "Bras�lia", "VENTVRIS VENTIS");
		Estado PA = new Estado("PA", "Bel�m", "SUB LEGE PROGREDIAMUR");
		Estado AC = new Estado("AC", "Rio Branco", "NEC LUCEO PLURIBUS IMPAR");
		Estado PI = new Estado("PI", "Teresina", "IMPAVIDUM FERIENT RUINAE");
		estados.add(RJ);
		estados.add(MG);
		estados.add(SP);
		estados.add(ES);
		estados.add(TO);
		estados.add(BA);
		estados.add(DF);
		estados.add(PA);
		estados.add(AC);
		estados.add(PI);
>>>>>>> Stashed changes
	}
	
	/*
	public static int[] geraValoresNaoRepetidos(int quantidade, int maxValor){
		int[] evitaRedundancia = new int[quantidade];
		int posic = 0;
		int flag = 0;
		Random r = new Random();
		while(posic<quantidade-1){
			int numeroAleatorio = r.nextInt(maxValor+1) + 0;
			for(int i=0; i<=posic;i++){
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
	*/
	

<<<<<<< Updated upstream
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
		
		int EA1; //estado aleatório
		int EA2;
		//seleciona as capitais aleatórias para opções
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
		
		/*Imprime de forma aleatoria as três opções de capitais baseado no valor de determinaOrdem
		
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
		System.out.print("Continuar? \n0: não\n1:sim");
		int continua = input.nextInt();
		if(continua == 0){
			return pontos;
		}
		if(continua == 1)
			IniciarCapitalEstado(pontos);
		
		return 0;
	}
	
=======


>>>>>>> Stashed changes

}
