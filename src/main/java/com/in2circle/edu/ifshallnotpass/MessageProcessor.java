package com.in2circle.edu.ifshallnotpass;

/**
 * Common interface for all message processors
 *
 * @author Alexander Czar
 */
public interface MessageProcessor {
	/**
	 * Processes a message of type 'A'.
	 *
	 * @param message the message to process.
	 */
	public void processMessage(MessageA message);

	/**
	 * Processes a message of type 'B'.
	 *
	 * @param message the message to process.
	 */
	public void processMessage(MessageB message);

	/**
	 * Processes a message of type 'C'.
	 *
	 * @param message the message to process.
	 */
	public void processMessage(MessageC message);
}
