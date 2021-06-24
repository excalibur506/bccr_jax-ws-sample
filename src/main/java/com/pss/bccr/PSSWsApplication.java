package com.pss.bccr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.pss.bccr.tests.FirmadoOk;
import com.pss.bccr.tests.Test01;
import com.pss.bccr.tests.Test02;
import com.pss.bccr.tests.Test03;
import com.pss.bccr.tests.Test04;
import com.pss.bccr.tests.Test05;
import com.pss.bccr.tests.Test06;
import com.pss.bccr.tests.Test07;
import com.pss.bccr.tests.Test08;
import com.pss.bccr.tests.Test09;
import com.pss.bccr.tests.Test10;
import com.pss.bccr.tests.Test11;
import com.pss.bccr.tests.Test12;
import com.pss.bccr.tests.Test13;
import com.pss.bccr.tests.Test14;
import com.pss.bccr.tests.Test15;
import com.pss.bccr.tests.Test16;

/**
 * PSSWsApplication
 * 
 * @author Martin Jimenez - PSS Prime Software Solutions
 *
 */
@SpringBootApplication
public class PSSWsApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(PSSWsApplication.class);

	@Autowired
	ApplicationContext context;

	@Autowired
	FirmadoOk firmadoOk;

	@Autowired
	Test01 test01;

	@Autowired
	Test02 test02;

	@Autowired
	Test03 test03;

	@Autowired
	Test04 test04;

	@Autowired
	Test05 test05;

	@Autowired
	Test06 test06;

	@Autowired
	Test07 test07;

	@Autowired
	Test08 test08;

	@Autowired
	Test09 test09;

	@Autowired
	Test10 test10;

	@Autowired
	Test11 test11;

	@Autowired
	Test12 test12;

	@Autowired
	Test13 test13;

	@Autowired
	Test14 test14;

	@Autowired
	Test15 test15;

	@Autowired
	Test16 test16;

	@Value("${SSL_DEBUG}")
	String sslDebug;

	@Value("${SSL_KEYSTORE}")
	String sslKeyStore;

	@Value("${SSL_KEYSTORE_TYPE}")
	String sslKeyStoreType;

	@Value("${SSL_KEYSTORE_PASS}")
	String sslKeyStorePass;

	@Override
	public void run(String... args) throws Exception {
		logger.info("running ...");

		System.setProperty("javax.net.ssl.debug", sslDebug);
		System.setProperty("javax.net.ssl.keyStore", sslKeyStore);
		System.setProperty("javax.net.ssl.keyStoreType", sslKeyStoreType);
		System.setProperty("javax.net.ssl.keyStorePassword", sslKeyStorePass);

		assert firmadoOk.test() == 0;
		logger.info("firmadoOk ok");

		assert test01.test() == 1;
		logger.info("test01 ok");

		assert test02.test() == 2;
		logger.info("test02 ok");

		assert test03.test() == 3;
		logger.info("test03 ok");

		assert test04.test() == 4;
		logger.info("test04 ok");

		assert test05.test() == 5;
		logger.info("test05 ok");

		assert test06.test() == 6;
		logger.info("test06 ok");

		assert test07.test() == 7;
		logger.info("test07 ok");

		assert test08.test() == 8;
		logger.info("test08 ok");

		assert test09.test() == 9;
		logger.info("test09 ok");

		assert test10.test() == 10;
		logger.info("test10 ok");

		assert test11.test() == 11;
		logger.info("test11 ok");

		assert test12.test() == 12;
		logger.info("test12 ok");

		assert test13.test() == 13;
		logger.info("test13 ok");

		assert test14.test() == 14;
		logger.info("test14 ok");

		assert test15.test() == 15;
		logger.info("test15 ok");

		assert test16.test() == 16;
		logger.info("test16 ok");

		logger.info("shutting down ...");

		((ConfigurableApplicationContext) context).close();
	}

	public static void main(String[] args) {
		SpringApplication.run(PSSWsApplication.class, args);
	}
}
