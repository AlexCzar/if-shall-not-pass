package com.in2circle.edu.ifshallnotpass;

/**
 * A simple implementation which prints message properties to {@code stdout} and marks them as processed.
 *
 * @author Alexander Czar
 */
public class SimpleMessageProcessor implements MessageProcessor {
	@Override
	public void processMessage(MessageA message) {
		System.out.format("Processing MessageA with id '%s'\n", message.getId());
		System.out.format("Addressee is: %s\n", message.getAddressee());
		message.markAsProcessed();
	}

	@Override
	public void processMessage(MessageB message) {
		System.out.format("Processing MessageB with id '%s\n'", message.getId());
		System.out.format("Message addressees are %s\n", message.getAddressees().toArray());
		message.markAsProcessed();
	}

	@Override
	public void processMessage(MessageC message) {
		System.out.format("Processing MessageC with id '%s'\n", message.getId());
		System.out.format("Message priority is '%s'\n", message.getPriority());
		message.markAsProcessed();
	}
}
