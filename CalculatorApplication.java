package Service;

import javax.xml.ws.Endpoint;

public class CalculatorApplication {
	public static void main(String [] args) {
		CalculatorResource resource = new CalculatorResource();
		Endpoint.publish("http://localhost:1212/calci", resource);
		System.out.println("Calculator is published....");
		
		
	}

}
