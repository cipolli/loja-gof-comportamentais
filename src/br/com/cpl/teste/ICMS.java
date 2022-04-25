package br.com.cpl.teste;

import java.math.BigDecimal;

import br.com.cpl.imposto.Imposto;
import br.com.cpl.orcamento.Orcamento;

public class ICMS implements Imposto {

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
	}

}
