package com.co.apisoap.callingservicessoap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;



public class ConfigurationHello {
	
	@Value("${WSDL.ClientEndpoint}")
	private String clientEndpoint;

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.cdyne.ws.weatherws");
		return marshaller;
	}

	@Bean
	public SOAPConnectClient soapconnector(Jaxb2Marshaller marshaller) {
		SOAPConnectClient client = new SOAPConnectClient();
		client.setDefaultUri(clientEndpoint);
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
