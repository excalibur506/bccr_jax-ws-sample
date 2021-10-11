# bccr_jax-ws-sample

Este proyecto se hizo con la motivación de servir de guía a quienes quieran consumir los webservices del Banco Central de Costa Rica
Que requieran autenticación SSL del cliente.

Utiliza 
Spring Boot Application https://spring.io/

Basado en el tutorial https://spring.io/guides/gs/consuming-web-service/

Se requiere que la persona esta algo familiarizada con estas tecnologias

Dicho esto, empecemos

No pretendemos que sea una receta sino mas bien una guia

1) Primero se deben agregar los certificados que nos entrega el BCCR en el trustsstore del JDK
   Java utiliza un key store tipo jks (java key store), se puede cambiar posiblemente a un store tipo pkcs12 con extensiones pfx o p12
   El key store default de Java se llama cacerts y esta ubicado en $JAVA_HOME/jre/lib/security y la contraseña inicial es changeit

   por ejemplo el siguiente comando agrega el certificado raiz al java key store cacerts

   		keytool -import -alias bccr_raiz -file "01.CA RAIZ NACIONAL - COSTA RICA v2.cer" -keystore $JAVA_HOME/jre/lib/security/cacerts -storepass changeit

   	Se debe hacer lo mismo con los otros certificados
		02.CA POLITICA PERSONA JURIDICA - COSTA RICA v2.cer
		03.CA SINPE - PERSONA JURIDICA v2.cer
		03.CA SINPE - PERSONA JURIDICA v2(1).crt
		04.Certificado BANCO CENTRAL DE COSTA RICA (AGENTE ELECTRONICO).cer


2) Colocar en algun sitio el certificado agente y los certificados intermedios, es un  archivo con la extensión .pfx o bien .p12 

3) Revisa el application.properties y cambiar lo que se necesite

	SSL_DEBUG = true
	SSL_KEYSTORE_TYPE = pkcs12
	SSL_KEYSTORE_PASS = contraseña-archivo-.p12
	SSL_KEYSTORE = ruta-al-archivo.pfx

	WS_URL_PROD = https://firmadorexterno.bccr.fi.cr/WebServices/Bccr.Firma.Fva.Entidades.Sello.Ws.SI/SelladorElectronicoConControlDeLlave.asmx
	WS_URL_TESTING = https://firmadorexterno.bccr.fi.cr/WebServices/Bccr.Fva.Entidades.AmbDePruebas.Sello.Ws.SI/SelladorElectronicoConControlDeLlave.asmx

	WS_URL = https://firmadorexterno.bccr.fi.cr/WebServices/Bccr.Fva.Entidades.AmbDePruebas.Sello.Ws.SI/SelladorElectronicoConControlDeLlave.asmx


	CODIGO_NEGOCIO = 1


	RAZON = Mi razon para firmar
	LUGAR = Mi lugar donde se firma


4) Construye el proyecto
    mvn clean install -DskipTests

5) Run the tests
   java -jar target/PSS-WsSample-0.0.1.jar


