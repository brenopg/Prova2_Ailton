package br.edu.iftm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.iftm.importacao.Importacao;

public class TestesImportacao {
	@Test
	public void testImportacaoSemAliquota(){
		Importacao i = new Importacao();
		i.setValorProduto(10);
		i.setCotacaoDolar(2);
		
		double esperado = 20.0;
		double atual = i.calculaValorProduto();
		
		assertEquals(esperado, atual, 0.0);
	}
	
	@Test
	public void testImportacaoComAliquota(){
		Importacao i = new Importacao();
		i.setCotacaoDolar(2);
		i.setValorProduto(100);
		
		double esperado = 320;
		double atual= i.calculaValorProduto();
		
		assertEquals(esperado, atual, 0.0);
	}

}
