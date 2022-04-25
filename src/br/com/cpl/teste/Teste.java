package br.com.cpl.teste;

import java.math.BigDecimal;

import br.com.cpl.imposto.CalculadoraDeImposto;
import br.com.cpl.orcamento.Orcamento;

public class Teste {
	public static void main(String args []) {

		Orcamento orcamento = new Orcamento(BigDecimal.valueOf(100));
		CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
		BigDecimal valorImposto = calculadoraDeImposto.calcular(orcamento, new ICMS());
		
		System.out.println(valorImposto);
		
	}
}
