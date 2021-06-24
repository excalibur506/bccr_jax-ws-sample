package com.pss.bccr;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.transport.http.ClientHttpRequestMessageSender;

/**
 * 
 * @author Martin Jimenez - Prime Software Solutions
 *
 */
public class BCCRSoapConnector extends WebServiceGatewaySupport {
	private static final int ONE_MINUTE = 60_000;

	private static final int READ_TIMEOUT = ONE_MINUTE * 10;
	private static final int CONNECTION_TIMEOUT = ONE_MINUTE * 10;

	public BCCRSoapConnector() {

		final SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();

		requestFactory.setReadTimeout(READ_TIMEOUT);
		requestFactory.setConnectTimeout(CONNECTION_TIMEOUT);

		setMessageSender(new ClientHttpRequestMessageSender(requestFactory));
	}

	public Object callWebService(final Object request, final String soapAction) {
		final WebServiceTemplate webServiceTemplate = getWebServiceTemplate();

		webServiceTemplate.setCheckConnectionForFault(true);

		final Object response = webServiceTemplate.marshalSendAndReceive(request, new SoapActionCallback(soapAction));

		return response;
	}
}
