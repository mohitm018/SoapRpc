package org.example.publisher;

import jakarta.xml.ws.Endpoint;
import org.example.publisher.HelloWorldImpl;

public class Publisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8090/ws/helloworld", new HelloWorldImpl());
		System.out.println("Publisher is running");
	}
}