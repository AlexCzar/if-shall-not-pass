package com.in2circle.edu.ifshallnotpass;

import java.util.Collections;
import java.util.List;

/**
 * @author Alexander Czar
 */
public class MessageB extends Message {
	private final List<String> addressees;

	protected MessageB(String id, List<String> addressees) {
		super(id);
		this.addressees = addressees;
	}

	public List<String> getAddressees() {
		return Collections.unmodifiableList(addressees);
	}

	// TODO: your code can be here
}
