package com.in2circle.edu.ifshallnotpass;

/**
 * @author Alexander Czar
 */
public class MessageA extends Message {
	private final String addressee;

	protected MessageA(String id, String addressee) {
		super(id);
		this.addressee = addressee;
	}

	public String getAddressee() {
		return addressee;
	}

	// TODO: your code can be here
}
