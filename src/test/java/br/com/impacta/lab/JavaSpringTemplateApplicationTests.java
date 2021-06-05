package br.com.impacta.lab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JavaSpringTemplateApplicationTests {

	@Test
	public void shouldHaveInstantiateCCWithSucess() {
		
		Conta cc = new ContaCorrente("CC",10, 1);
		
		assertEquals("CC", cc.getTipo());
		
	}
	
	@Test
	public void shouldHaveInstantiateCPWithSucess() {
		
		Conta cp = new ContaPoupanca("CP",5, 12);
		
		assertEquals("CP", cp.getTipo());
		
	}
	
}
