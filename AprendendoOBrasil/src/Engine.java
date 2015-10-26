import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class Engine {

	private static List <Estado> estados;


	public static int iniciarCapitalEstado(int pontos, List<Estado> estados){
		Scanner input = new Scanner(System.in);
		System.out.print("Escolha o estado\n");
		
		for(int i=0;i<10;i++){
			System.out.println(i + ". " + (estados.get(i)).getNome());
		}
		int estadoEscolhido = input.nextInt();

		int EA1, EA2;
		
		if(1 != estadoEscolhido){
			EA1 = 1;
			if(2 != estadoEscolhido){
				EA2 = 2;
			}
			else{
				EA2 = 3;
			}
		}
		else{
			EA1 = 2; 
			EA2 = 5;
		}
		int correto =0;
		System.out.println("Estado: " + estados.get(estadoEscolhido).getNome() );
		System.out.println("Escolha a capital : ");
		System.out.println("1. " + estados.get(estadoEscolhido).getCapital().getNomeCapital() );
		System.out.println("2. " + estados.get(EA1).getCapital().getNomeCapital() );
		System.out.println("3. " + estados.get(EA2).getCapital().getNomeCapital() );
		
		int resposta = input.nextInt();
		if(resposta == 1) {
			System.out.print("Resposta Correta!");
			correto = 1;
			pontos+=10;
		}
		else{
			System.out.print("Resposta Incorreta  :( ");
			correto = 0;
		}
		

		System.out.print("Continuar? \n0: não\n1:sim");
		int continua = input.nextInt();
		if(continua == 0){
			return pontos;
		}
		if(continua == 1)
			iniciarCapitalEstado(pontos,estados);
		
		if (correto==1) pontos+=10;
		return pontos;
	}
	
	
	 public static int iniciarBandeiraEstado(int pontos, int idBandeira, List<Estado> estados){
		 Scanner input = new Scanner(System.in);
		 
		 for(int j=0;j<10;j++){
			 System.out.println(j + ". " + estados.get(j).getNome());
		 }
		 
		 System.out.println(estados.get(idBandeira).getBandeira().getLema());
		 System.out.print("Escolha o estado que corresponde ao lema acima\n");
		 int resposta = input.nextInt();
		 int correto =0;
		 if((estados.get(resposta).getBandeira().getLema()).equals(estados.get(idBandeira).getBandeira().getLema())) {
			 System.out.print("Resposta Correta!");
			 correto = 1;
			 pontos+=10;
		 }
		 else{
			 System.out.print("Resposta Incorreta  :( ");
			 correto = 0;
		 }


		 System.out.print("Continuar? \n0: não\n1:sim");
		 int continua = input.nextInt();
		 if(continua == 0){
			 return pontos;
		 }
		 if(continua == 1){
			 idBandeira++;
			 iniciarBandeiraEstado(pontos, idBandeira, estados);
		 }
		 if (correto==1) pontos+=10;
		 return pontos;
	 }
	 
	 public static void carregaPontosTuristicos(List<Estado> estados){
		 Scanner input = new Scanner(System.in);
		 
		 //Populando vetor de pontos turísticos do RJ		 
		 List<PontoTuristico> pontosTuristicosRJ = new ArrayList <PontoTuristico>();
		 pontosTuristicosRJ.add(new PontoTuristico("Cristo Redentor"));
		 pontosTuristicosRJ.add(new PontoTuristico("Serra dos Órgãos"));
		 pontosTuristicosRJ.add(new PontoTuristico("Pico da Tijuca"));
		 estados.get(0).setPontosTuristicos(pontosTuristicosRJ);
		 
		 //Populando vetor de pontos turísticos de MG		 		 
		 List<PontoTuristico> pontosTuristicosMG = new ArrayList <PontoTuristico>();
		 pontosTuristicosMG.add(new PontoTuristico("Inhotim"));
		 pontosTuristicosMG.add(new PontoTuristico("Pedra Redonda"));
		 pontosTuristicosMG.add(new PontoTuristico("Parque Estadual do Ibitipoca"));
		 estados.get(1).setPontosTuristicos(pontosTuristicosMG);
		 
		 //Populando vetor de pontos turísticos de SP		 		 
		 List<PontoTuristico> pontosTuristicosSP = new ArrayList <PontoTuristico>();
		 pontosTuristicosSP.add(new PontoTuristico("Bovespa"));
		 pontosTuristicosSP.add(new PontoTuristico("Instituto Butantan"));
		 pontosTuristicosSP.add(new PontoTuristico("Bairro da Liberdade"));
		 estados.get(2).setPontosTuristicos(pontosTuristicosSP);
		 
		 //Populando vetor de pontos turísticos de ES		 		 
		 List<PontoTuristico> pontosTuristicosES = new ArrayList <PontoTuristico>();
		 pontosTuristicosES.add(new PontoTuristico("Parque Estadual da Pedra Azul"));
		 pontosTuristicosES.add(new PontoTuristico("Praia de Itapuã"));
		 pontosTuristicosES.add(new PontoTuristico("Palácio Anchieta"));
		 estados.get(3).setPontosTuristicos(pontosTuristicosES);
		 boolean flag = true;
		 while(flag == true){
		 for(int i=0;i<4;i++){
			 System.out.println(i + ". " + (estados.get(i)).getNome());
		 }
		 System.out.print("Escolha o estado\n");
		 int estadoEscolhido = input.nextInt();
		 
		 if(estadoEscolhido == 0){
			 for(PontoTuristico pontoTuristico : pontosTuristicosRJ){
				 pontoTuristico.imprimePontoTuristico();
			 }
		 }
		 
		 if(estadoEscolhido == 1){
			 for(PontoTuristico pontoTuristico : pontosTuristicosMG){
				 pontoTuristico.imprimePontoTuristico();
			 }
		 }
		 
		 if(estadoEscolhido == 2){
			 for(PontoTuristico pontoTuristico : pontosTuristicosSP){
				 pontoTuristico.imprimePontoTuristico();
			 }
		 }
		 if(estadoEscolhido == 3){
			 for(PontoTuristico pontoTuristico : pontosTuristicosES){
				 pontoTuristico.imprimePontoTuristico();
			 }
		 }
		 System.out.print("\n1: Continuar \n0: Sair");
		 int sair = input.nextInt();
		 if (sair==0){
			 flag = false;
		 }
		 
		 }

		 
		 
	
		
	 }
	
	
}
