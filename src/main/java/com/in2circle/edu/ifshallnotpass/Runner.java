package com.in2circle.edu.ifshallnotpass;


import java.util.Arrays;
import java.util.List;

/**
 * @author Alexander Czar
 */
public class Runner {
	private static MessageProcessor processor = new SimpleMessageProcessor();

	private static List<Message> messages = Arrays.asList(
			new MessageA("47f9eb94-1993-4c4b-ac4c-7bfeb06629f7", "feofan@example.com"),
			new MessageA("50416a79-201e-4564-821a-2f1926908880", "beqa@example.com"),
			new MessageB("c7f99bef-1680-4cdc-9f14-abc26d0443c6", Arrays.asList(
					"giga@example.com", "vazha@example.com", "natsarqeqia@example.com")),
			new MessageB("137408bc-51a2-4f45-9f0d-8e7b39a08449", Arrays.asList(
					"vasya@example.com", "petya@example.com", "kolya@example.com")),
			new MessageC("e8087f05-8bc6-4307-be91-a6bed81b2f38", "HIGH"),
			new MessageC("66302517-f285-4e1d-aa5e-9f793a474d6e", "MEDIUM"));

	public static void main(String... args) {
		messages.forEach(Runner::process);
		/*
				Line above is an iteration utilizing Java8 'stream' and 'method reference' features.
			it can be expanded to messages.forEach(message -> process(message)) - using a lambda
			instead of method reference.
				Both lambda and method reference are effectively equivalent to following loop:
			for (message : messages) {
				process(message);
			}
		 */
	}

	/**
	 * Process message using {@link #processor}.
	 *
	 * @param message the message to process.
	 */
	private static void process(Message message) {
		// TODO: your code can be here
		printDelimiter();
	}

	private static void printDelimiter() {
		System.out.println("--------------------------------------------------");
	}
}
