package br.com.curso.appium.core;

public class AbasPage extends BasePage {

	public boolean isAba1() {
		return existeElementoPorTexto("Este � o conte�do da Aba 1");
	}

	public boolean isAba2() {
		return existeElementoPorTexto("Este � o conte�do da Aba 2");
	}

	public void selecionarAbar2() {
		clicarPorTexto("ABA 2");
	}

}
