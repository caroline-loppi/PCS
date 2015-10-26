import java.util.ArrayList;
import java.util.List;

public class Estado {
	
	private String nome;
	private Capital capital;
	private Bandeira bandeira;
	private List <PontoTuristico> pontosTuristicos;
	
	public Estado(){
		
	}
	
	public Estado(String nome, String nomeCapital, String lemaBandeira){
		this.nome = nome;
		this.capital = new Capital(nomeCapital);
		this.bandeira = new Bandeira(lemaBandeira);
		this.pontosTuristicos = new ArrayList <PontoTuristico>();
	}
	
	public void adicionarPontoTuristico(String nomePontoTuristico){
		pontosTuristicos.add(new PontoTuristico(nomePontoTuristico));
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Capital getCapital() {
		return capital;
	}
	public void setCapital(Capital capital) {
		this.capital = capital;
	}
	public Bandeira getBandeira() {
		return bandeira;
	}
	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}
	public List<PontoTuristico> getPontosTuristicos() {
		return pontosTuristicos;
	}
	public void setPontosTuristicos(List<PontoTuristico> pontosTuristicos) {
		this.pontosTuristicos = pontosTuristicos;
	}

	
	
	
	

}
