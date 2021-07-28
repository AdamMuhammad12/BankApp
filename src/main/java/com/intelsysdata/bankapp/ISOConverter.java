package com.intelsysdata.bankapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ISOConverter {
	private Iso8583 iso8583;
	private Iso20022 iso20022;
	private Rules rules;
	
	public Boolean convert8583to20022() {
		rules.setSource(iso8583);
		rules.setTarget(iso20022);
		return rules.convert();
	}
	
	public Boolean convert20022to8583() {
		rules.setSource(iso20022 );
		rules.setTarget(iso8583);
		return rules.convert();
	}

}
