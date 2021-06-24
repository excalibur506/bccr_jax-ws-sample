package com.pss.bccr.tests;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.pss.bccr.BCCRSoapConnector;

import bccr.fva.cr.stub.AlgoritmoDeHash;
import bccr.fva.cr.stub.RecibaLaSolicitudDeSelladoElectronicoPdf;
import bccr.fva.cr.stub.RecibaLaSolicitudDeSelladoElectronicoPdfResponse;
import bccr.fva.cr.stub.RespuestaDeLaSolicitud;
import bccr.fva.cr.stub.SolicitudDeFirmaPdf;

/**
 * 
 * @author Martin Jimenez - Prime Software Solutions
 *
 */
@Component
public class FirmadoOk implements ITests {

	private static final Logger logger = LoggerFactory.getLogger(FirmadoOk.class);

	@Autowired
	private BCCRSoapConnector soapClient;

	@Value("${CODIGO_NEGOCIO}")
	int codigoNegocio;

	@Value("${RAZON}")
	String razon;

	@Value("${LUGAR}")
	String lugar;

	/**
	 * @ESCENARIO DE PRUEBA #1
	 * @Referencia: ESCENARIOS DEL AMBIENTE DE PRUEBAS PARA LA
	 * @FUNCIONALIDAD DE SELLADO SELLO ELECTRÓNICO
	 * 
	 * @Ha ocurrido algún problema al solicitar la firma.
	 * 
	 * @return response code
	 * @throws Exception
	 */
	public int test() throws Exception {

		final RecibaLaSolicitudDeSelladoElectronicoPdf request;
		final RecibaLaSolicitudDeSelladoElectronicoPdfResponse response;

		{ // message payload
			final SolicitudDeFirmaPdf value = new SolicitudDeFirmaPdf();

			final byte[] pdfbytes = ITests.load(getClass().getResource(SAMPLE_PDF_FILE));

			value.setCodNegocio(codigoNegocio);

			value.setIdFuncionalidad(1);

			value.setDocumento(pdfbytes);
			value.setHashDocumento(ITests.hash(pdfbytes));
			value.setIDAlgoritmoHash(AlgoritmoDeHash.SHA_256);

			value.setLugar(lugar);
			value.setRazon(razon);
			value.setFechaDeReferenciaDeLaEntidad(ITests.xmlTime());

			request = new RecibaLaSolicitudDeSelladoElectronicoPdf();
			request.setLaSolicitud(value);
		}

		response = (RecibaLaSolicitudDeSelladoElectronicoPdfResponse) soapClient.callWebService(request,
				SOAP_PDF_ACTION);
		{
			final RespuestaDeLaSolicitud rr = response.getRecibaLaSolicitudDeSelladoElectronicoPdfResult();

			Files.write(Paths.get("c:/home/sample-signed.pdf"), rr.getDocumentoFirmado());

			logger.info(getClass().getName() + " -> " + rr.getCodigoDeError());

			return rr.getCodigoDeError();
		}
	}
}
