package br.com.curso.appium.page;

import org.junit.Assert;
import org.openqa.selenium.By;

import br.com.curso.appium.core.DSL;
import io.appium.java_client.MobileBy;

public class FormularioPage {

	
	private DSL dsl = new DSL();
	
	public void escreverNome(String nome) {
		dsl.escrever(MobileBy.AccessibilityId("nome"), "Eduardo");	
	}
	
	public String obterNome() {
		return dsl.obterTexto(MobileBy.AccessibilityId("nome"));
	}
	
	public void selecionarCombo(String valor){
		dsl.selecionarCombo(MobileBy.AccessibilityId("console"), valor);
	}
	
	public String obterValorCombo() {
		return dsl.obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
	}
	
	
	public void clicarCheck() {
		dsl.clicar(By.className("android.widget.CheckBox"));
	}
	
	public void clicarSwitch() {
		dsl.clicar(MobileBy.AccessibilityId("switch"));
	}
	
	public boolean isCheckMarcado() {
		return dsl.isCheckMarcado(By.className("android.widget.CheckBox"));
	}
	
	public boolean isSwitchMarcado() {
		return dsl.isCheckMarcado(MobileBy.AccessibilityId("switch"));
	}
	
	
	public void salvar() {
		dsl.clicarPorTexto("SALVAR");
	}

	
	
	
}