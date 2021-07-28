package com.intelsysdata.bankapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Rules {
	
	private ISOMessage source;
	private ISOMessage target;

	public abstract Boolean convert();

}
