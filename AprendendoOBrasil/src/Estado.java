
public class Estado {
	private String nomeEstado;
	private Capital capitalEstado;
	private Bandeira bandeiraEstado;
	private PontoTuristico[] pontosTuristicos;

	public Estado(String nomeEstado, Capital capitalEstado, Bandeira bandeiraEstado){
		//necess�rio popular nome do estado, capital e bandeira correspondente
		this.nomeEstado = nomeEstado;
		this.capitalEstado = capitalEstado;
		this.bandeiraEstado = bandeiraEstado;
	}
	
	public String getNomeEstado() {
		//retorna o nome do estado de tipo Estado do objeto em quest�o
		return nomeEstado;
	}
	
	public void setNomeEstado(String nomeEstado) {
		//altera o nome do estado do objeto de tipo Estado em quest�o
		this.nomeEstado = nomeEstado;
	}

	public String getCapitalEstado() {
		//retorna o nome da capital do objeto de tipo Estado em quest�o
		return capitalEstado.getNomeCapital();
	}

	public void setCapitalEstado(String nomeCapital) {
		//altera o nome da capital do objeto de tipo Estado em quest�o
		capitalEstado.setNomeCapital(nomeCapital); 
	}

	public String getBandeiraEstado() {
		//retorna o lema da bandeira do objeto de tipo Estado em quest�o
		return bandeiraEstado.getLema();
	}

	public void setBandeiraEstado(String lemaBandeira) {
		//altera o lema da bandeira do objeto de tipo Estado em quest�o
		bandeiraEstado.setLema(lemaBandeira);
	}
	
	public PontoTuristico[] getPontoTuristico(){ 
		//retorna o vetor de pontos tur�sticos para um dado objeto de tipo Estado
		return pontosTuristicos;
	}
	
	public void setPontoTuristico(PontoTuristico[] pontosTuristicos){
		//para um dado estado, popula o vetor de pontos tur�sticos com outro vetor j� populado
		for(int i=0;i<pontosTuristicos.length; i++){
			this.pontosTuristicos[i] = pontosTuristicos[i];
		}
	}
	
	
	
	
	
	
	

}
