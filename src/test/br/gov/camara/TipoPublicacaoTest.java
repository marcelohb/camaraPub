package br.gov.camara;


import org.junit.Test;

public class TipoPublicacaoTest {

	@Test
	public void novoTipoPublicacao() {
		TipoPublicacao tp = new TipoPublicacao("PAUTAS");
		assertEquals(tp, new TipoPublicacao("PAUTAS"));
	}

}
