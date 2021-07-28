package com.intelsysdata.bankapp;

import java.io.Serializable;

public interface ISOMessage extends Serializable {
	public void write();
	public void read();

}
