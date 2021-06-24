package com.pss.bccr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * 
 * @author Martin Jimenez - Prime Software Solutions
 *
 */
@Configuration
public class BCCRSoapConfig {

	private static final Logger logger = LoggerFactory.getLogger(BCCRSoapConfig.class);

	@Value("${WS_URL}")
	String wsurl;

	@Bean
	public Jaxb2Marshaller marshaller() throws Exception {
		final Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

		marshaller.setContextPath("bccr.fva.cr.stub");

		return marshaller;
	}

	@Bean
	public BCCRSoapConnector soapConnector(final Jaxb2Marshaller marshaller) {
		final BCCRSoapConnector client = new BCCRSoapConnector();

		logger.info("wsurl: " + wsurl);

		client.setDefaultUri(wsurl);
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);

		return client;
	}
}
