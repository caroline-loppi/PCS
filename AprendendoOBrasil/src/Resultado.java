import java.util.*;
public class Resultado {
	private Date data;              //contabilizada com o intuito de manter histórico do usuário
	private int pontuacaoBandeira;  //pontuação na seção de correlação bandeira-estado
	private int pontuacaoCapital;   //pontuação na seção de correlação capital-estado
	
	public Resultado(Date data, int pontuacao, int identificador){ 
		/*identificador é utilizado para diferenciar pontuação relacionada 
		à seção de correlação bandeira-estado(identificador possui valor 1)
		da seção correlação estado-capital(identificador possui valor 2)*/
		
		this.data = data;
		
		if(identificador==1){
			pontuacaoBandeira = pontuacao;
		}
		if(identificador==2){
			pontuacaoCapital = pontuacao;
		}
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getPontuacaoBandeira() {
		return pontuacaoBandeira;
	}

	public void setPontuacaoBandeira(int pontuacaoBandeira) {
		this.pontuacaoBandeira = pontuacaoBandeira;
	}

	public int getPontuacaoCapital() {
		return pontuacaoCapital;
	}

	public void setPontuacaoCapital(int pontuacaoCapital) {
		this.pontuacaoCapital = pontuacaoCapital;
	}
	
	


}
	
