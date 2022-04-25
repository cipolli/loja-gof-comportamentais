package br.com.cpl.imposto;

import java.math.BigDecimal;

import br.com.cpl.orcamento.Orcamento;

public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento);
}
