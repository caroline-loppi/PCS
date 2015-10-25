import java.util.*;
public class Resultado {
	private Date data;              //contabilizada com o intuito de manter hist�rico do usu�rio
	private int pontuacaoBandeira;  //pontua��o na se��o de correla��o bandeira-estado
	private int pontuacaoCapital;   //pontua��o na se��o de correla��o capital-estado
	
	public Resultado(Date data, int pontuacao, int identificador){ 
		/*identificador � utilizado para diferenciar pontua��o relacionada 
		� se��o de correla��o bandeira-estado(identificador possui valor 1)
		da se��o correla��o estado-capital(identificador possui valor 2)*/
		
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
	
