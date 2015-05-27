package main.java.br.gov.camara.dominio.modelo.TipoPublicacao;


public class 
 {

	private TipoPublicacaoId tipoPublicacaoId;
	private String descricao;

	public TipoPublicacao(TipoPublicacaoId id, String descricao) {
		this.tipoPublicacaoId = id;
		this.descricao = descricao;
	}
	
	public String descricao() {
		return this.descricao;
	}
}
