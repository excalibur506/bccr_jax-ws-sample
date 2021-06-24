package com.pss.bccr.tests;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.security.MessageDigest;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Base64;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * 
 * @author Martin Jimenez - Prime Software Solutions
 *
 */
interface ITests {
	String HASH_SHA_256 = "SHA-256";

	String SOAP_PDF_ACTION = "http://bccr.fva.cr/RecibaLaSolicitudDeSelladoElectronicoPdf";
	String SOAP_XML_ACTION = "http://bccr.fva.cr/RecibaLaSolicitudDeSelladoElectronicoXmlEnvelopedContraFirma";

	String SAMPLE_PDF_FILE = "/docs/sample.pdf";
	String SAMPLE_DOC_FILE = "/docs/sample.docx";
	String SAMPLE_XML_FILE = "/docs/sample.xml";
	String SAMPLE_SIGNED_PDF_FILE = "/docs/sample-signed.pdf";

	/**
	 * Hash function #HASH_SHA_256
	 * 
	 * @param src
	 * @return
	 * @throws Exception
	 */
	static byte[] hash(final byte[] src) throws Exception {
		return MessageDigest.getInstance(HASH_SHA_256).digest(src);
	}

	/**
	 * 
	 * @param bytes
	 * @return
	 */
	static byte[] b64encode(final byte[] bytes) {
		return Base64.getEncoder().encode(bytes);
	}

	/**
	 * 
	 * @param bytes
	 * @return
	 */
	static byte[] b64decode(final byte[] bytes) {
		return Base64.getDecoder().decode(bytes);
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	static XMLGregorianCalendar xmlTime() throws Exception {

		final String zonedtime = ZonedDateTime.now(ZoneId.of("America/Costa_Rica")).toString().substring(0, 23) + "Z";

		final XMLGregorianCalendar value = DatatypeFactory.newInstance().newXMLGregorianCalendar(zonedtime);

		return value;
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	static XMLGregorianCalendar xmlBadTime() throws Exception {

		final String zonedtime = ZonedDateTime.now(ZoneId.of("America/Buenos_Aires")).toString().substring(0, 23) + "Z";

		final XMLGregorianCalendar value = DatatypeFactory.newInstance().newXMLGregorianCalendar(zonedtime);

		return value;
	}

	static byte[] load(final URL url) throws Exception {

		final byte[] byteChunk = new byte[4096];
		final ByteArrayOutputStream baos = new ByteArrayOutputStream();

		try (InputStream is = url.openStream()) {

			int n;
			while ((n = is.read(byteChunk)) > 0) {
				baos.write(byteChunk, 0, n);
			}

			return baos.toByteArray();
		}
	}
}
