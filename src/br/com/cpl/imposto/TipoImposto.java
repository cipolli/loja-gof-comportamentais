package br.com.cpl.imposto;

import java.math.BigDecimal;

public enum TipoImposto {
	ICMS {
		@Override
		public BigDecimal alicotaImposto() {
			return BigDecimal.valueOf(0.1);
		}
	},
	ISS {
		@Override
		public BigDecimal alicotaImposto() {
			return BigDecimal.valueOf(0.06);
		}
	};
	
	public abstract BigDecimal alicotaImposto();
}
