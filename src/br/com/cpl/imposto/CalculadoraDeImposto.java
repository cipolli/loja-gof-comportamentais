package br.com.cpl.imposto;

import java.math.BigDecimal;

import br.com.cpl.orcamento.Orcamento;

public class CalculadoraDeImposto {
	
	public BigDecimal calcular(Orcamento orcamento, TipoImposto tipo) {
		switch (tipo) {
		case ICMS: {
			return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
		}
		case ISS : {
			return orcamento.getValor().multiply(BigDecimal.valueOf(0.06));
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipo);
		}
	}

}
