
public class PontoTuristico {
	private String pontoTuristico;
	
	public PontoTuristico(String pontoTuristico){
		this.pontoTuristico = pontoTuristico;
	}

	public String getPontoTuristico() {
		return pontoTuristico;
	}

	public void setPontoTuristico(String pontoTuristico) {
		this.pontoTuristico = pontoTuristico;
	}
	
	public void imprimePontoTuristico(){
		System.out.println(this.getPontoTuristico());
	}
	
	

}
