package br.com.cpl.imposto;

import java.math.BigDecimal;

import br.com.cpl.orcamento.Orcamento;

public class CalculadoraDeImposto {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {

		return imposto.calcular(orcamento);
	}
}
